package ch16_stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectEx02 {

	public static void main(String[] args) {
		Student3[] stuArr = {
			new Student3("나자바", true,  1, 1, 300),	
			new Student3("김지미", false, 1, 1, 250),	
			new Student3("김자바", true,  1, 1, 200),	
			new Student3("이지미", false, 1, 2, 150),	
			new Student3("남자바", true,  1, 2, 100),	
			new Student3("안지미", false, 1, 2,  50),	
			new Student3("황지미", false, 1, 3, 100),	
			new Student3("강지미", false, 1, 3, 150),	
			new Student3("이자바", true,  1, 3, 200),	
			new Student3("나자바", true,  2, 1, 300),	
			new Student3("김지미", false, 2, 1, 250),	
			new Student3("김자바", true,  2, 1, 200),	
			new Student3("이지미", false, 2, 2, 150),	
			new Student3("남자바", true,  2, 2, 100),	
			new Student3("안지미", false, 2, 2,  50),	
			new Student3("황지미", false, 2, 3, 100),	
			new Student3("강지미", false, 2, 3, 150),	
			new Student3("이자바", true,  2, 3, 200)	
		};
		Map<Boolean, List<Student3>> stu = Stream.of(stuArr)
		.collect(Collectors.partitioningBy(Student3::isMale));
		
		System.out.println("남자");
		for(Student3 s : stu.get(true)) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println("여자");
		for(Student3 s : stu.get(false)) {
			System.out.println(s);
		}
		
	
	}
}
