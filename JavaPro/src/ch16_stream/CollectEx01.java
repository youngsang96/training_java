package ch16_stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import ch16_stream.Student5;
/* 
 * Collectors
 * Collectors.toList()
 * Collectors.toArray()
 * Collectors.toMap(key, value)
 */


class CollectEx01 {
	public static void main(String[] args) {
		Student5[] stuArr = {
			new Student5("이자바", 3, 34,55,80),
			new Student5("김자바", 1, 60,45,90),
			new Student5("안자바", 2, 80,95,60),
			new Student5("박자바", 2, 75,85,70),
			new Student5("소자바", 1, 65,65,90),
			new Student5("나자바", 3, 60,85,50),
			new Student5("감자바", 3, 40,75,60)
		};
		
		//1.학생들 이름만 뽑아서 List<Strint>에 저장한다.
		List<String> names = Stream.of(stuArr)
				.map(Student5::getName)
				.collect(Collectors.toList());
		System.out.println("1. 학생들 이름만 뽑아서 List<Strint>에 저장");
		System.out.println(names);
		//2. Student5[] 저장
		Student5[] stuArr2 = Stream.of(stuArr)
				.toArray(Student5[]::new);
		System.out.println();
		System.out.println("2. Student5[] 저장");
		for(Student5 s : stuArr2) {
			System.out.println(s);
		}
		System.out.println();
		//3. Map<String, Student5>로 변환(Key는 이름)
		Map<String, Student5> stuMap = Stream.of(stuArr)
				.collect(Collectors.toMap(s->s.getName(), s->s));
		System.out.println("3. Map<String, Student5>로 변환");
		for(Object name : stuMap.keySet()) {
			System.out.println(name+"-"+stuMap.get(name));
		}
		System.out.println();
		//4. Collectors.counting()
		long count = Stream.of(stuArr)
				.collect(Collectors.counting());
				System.out.println("4. Collectors.counting(): " + count);
		System.out.println();
		//5. Collectors.summingInt
		int total =
		Stream.of(stuArr).collect(Collectors.summingInt((Student5::getScore)));
		System.out.println("5. Collectors.summingInt: "+ total);
		
		System.out.println();
		//6. Collectors.reducing(0, s->s.getScore: )
		total =
				//Stream.of(stuArr).collect(Collectors.reducing(0,s->s.getScore(), (a,b) -> a+b));
				Stream.of(stuArr).collect(Collectors.reducing(0, Student5::getScore, Integer::sum));
		System.out.println("6. Collectors.reducing(0, s->s.getScore): " + total);
		System.out.println();
		Optional<Student5> s =Stream.of(stuArr)
				.collect(Collectors.maxBy(Comparator.comparingInt(Student5::getScore)));
		System.out.println("7. Optional<Student5>: "+ s.get());
		
		String lines = Stream.of(stuArr)
				.map(Student5::getName)
				.collect(Collectors.joining(",","{","}"));
		System.out.println();
		System.out.println("8. Collectors.joining: "+ lines);
		
	}
}
