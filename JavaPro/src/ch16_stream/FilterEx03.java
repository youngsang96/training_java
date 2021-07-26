package ch16_stream;

import java.util.List;
import java.util.Arrays;
/*
 * Method reference
���ٽ�	                   				�޼ҵ� ����
static �޼ҵ�	a ->Ŭ�����̸�.�޼ҵ�(a)	    Ŭ�����̸�::�޼ҵ��̸�
�ν��Ͻ� �޼ҵ�	(a, b) -> a.�޼ҵ�(b)		Ŭ�����̸�::�޼ҵ��̸�
(a) -> ��ü.�޼ҵ�(a)					Ŭ�����̸�::�޼ҵ��̸�
������	(a) -> new ������(a)			�������̸�::new
�迭 ������	(a) -> new Ÿ��[a]		Ÿ��::new

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
				.asList(new Member("ȫ�浿", Member.MALE, 30), 
						new Member("�質��", Member.FEMALE, 20),
						new Member("�ſ��", Member.MALE, 45), 
						new Member("�ڼ���", Member.FEMALE, 27));
		// TODO Auto-generated method stub
		double ageAvg = list.stream()
		.filter(m->m.getSex() == Member.MALE)
		.mapToInt(s->s.getAge())
		.average()
		.getAsDouble();
	System.out.println("������ճ���: " + ageAvg);
	}

}
