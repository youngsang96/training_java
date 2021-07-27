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
			new Student5("���ڹ�", 3, 34,55,80),
			new Student5("���ڹ�", 1, 60,45,90),
			new Student5("���ڹ�", 2, 80,95,60),
			new Student5("���ڹ�", 2, 75,85,70),
			new Student5("���ڹ�", 1, 65,65,90),
			new Student5("���ڹ�", 3, 60,85,50),
			new Student5("���ڹ�", 3, 40,75,60)
		};
		
		//1.�л��� �̸��� �̾Ƽ� List<Strint>�� �����Ѵ�.
		List<String> names = Stream.of(stuArr)
				.map(Student5::getName)
				.collect(Collectors.toList());
		System.out.println("1. �л��� �̸��� �̾Ƽ� List<Strint>�� ����");
		System.out.println(names);
		//2. Student5[] ����
		Student5[] stuArr2 = Stream.of(stuArr)
				.toArray(Student5[]::new);
		System.out.println();
		System.out.println("2. Student5[] ����");
		for(Student5 s : stuArr2) {
			System.out.println(s);
		}
		System.out.println();
		//3. Map<String, Student5>�� ��ȯ(Key�� �̸�)
		Map<String, Student5> stuMap = Stream.of(stuArr)
				.collect(Collectors.toMap(s->s.getName(), s->s));
		System.out.println("3. Map<String, Student5>�� ��ȯ");
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
