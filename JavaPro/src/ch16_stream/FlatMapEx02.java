package ch16_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ch16_stream.Student4;

public class FlatMapEx02 {
	public static void main(String[] args) {
		List<Student4> studentList1 = Arrays.asList(
				new Student4("ȫ�浿", 10),new Student4("������", 20),
				new Student4("���ϵ�", 30)	);
		List<Student4> studentList2 = Arrays.asList(
				new Student4("���ڹ�", 10),new Student4("�ſ��", 20),
				new Student4("���̼�", 30)	);
		
		
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

