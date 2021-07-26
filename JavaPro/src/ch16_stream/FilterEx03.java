package ch16_stream;

import java.util.List;
import java.util.Arrays;
/*
 * Method reference
람다식	                   				메소드 참조
static 메소드	a ->클래스이름.메소드(a)	    클래스이름::메소드이름
인스턴스 메소드	(a, b) -> a.메소드(b)		클래스이름::메소드이름
(a) -> 객체.메소드(a)					클래스이름::메소드이름
생성자	(a) -> new 생성자(a)			생성자이름::new
배열 생성자	(a) -> new 타입[a]		타입::new

*/
//	.peek(s -> System.out.println(s));
//		.peek(System.out::println);

class Member {
	public static int MALE = 0;
	public static int FEMALE = 1;
	private String name;
	private int sex;
	private int age;

	public Member(String name, int sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}
}

public class FilterEx03 {
	
	public static void main(String[] args) {
		List<Member> list = Arrays
				.asList(new Member("홍길동", Member.MALE, 30), 
						new Member("김나리", Member.FEMALE, 20),
						new Member("신용권", Member.MALE, 45), 
						new Member("박수미", Member.FEMALE, 27));
		// TODO Auto-generated method stub
		double ageAvg = list.stream()
		.filter(m->m.getSex() == Member.MALE)
		.mapToInt(s->s.getAge())
		.average()
		.getAsDouble();
	System.out.println("남자평균나이: " + ageAvg);
	}

}
