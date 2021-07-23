package ch16_stream;
import java.util.*;
import java.util.stream.*;
class Student2 {
	private String name;
	private int score;

	public Student2(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
}

public class ReductionEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student2> studentList =
				Arrays.asList(
						new Student2("홍길동", 92), 
						new Student2("신용권", 95),
						new Student2("감자바", 88));
		
		int sum1 = studentList.stream().mapToInt(Student2::getScore).sum();
		int sum2 = studentList.stream().mapToInt(Student2::getScore).reduce((a,b)->a+b).getAsInt();
		int sum3 = studentList.stream().mapToInt(Student2::getScore).reduce(0,(a,b)->a+b);
		
		System.out.println("sum1 : "+sum1);
		System.out.println("sum2 : "+sum2);
		System.out.println("sum3 : "+sum3);
	}

}
