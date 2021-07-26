package ch16_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ch16_stream.Student4;

public class FlatMapEx02 {
	public static void main(String[] args) {
		List<Student4> studentList1 = Arrays.asList(
				new Student4("홍길동", 10),new Student4("강나라", 20),
				new Student4("장일동", 30)	);
		List<Student4> studentList2 = Arrays.asList(
				new Student4("나자바", 10),new Student4("신용권", 20),
				new Student4("유미선", 30)	);
		
		
		List<List<Student4>> stu = new ArrayList<List<Student4>>();
		         stu.add(studentList1);
		         stu.add(studentList2);
		long sum= stu.stream()
  //		.flatMap(s -> s.stream())
			.flatMap(List::stream)
		
	//		.mapToInt(Student :: getScore)
			.mapToInt(s -> s.getScore())
			.count();
		      System.out.println(sum);
			//.forEach(score -> System.out.println(score));
	}
}

