package ch16_stream;

import java.util.*;
import java.util.stream.Stream;

class Student {
	private String name;
	private int eng;
	private int math;
	private String major;
	public Student(String name, int eng, int math, String major) {
		this.name = name;
		this.eng = eng;
		this.math = math;
		this.major = major;
	}
	//getter
	public String getName() {		return name;	}
	public int getEng() {		return eng;	}
	public int getMath() {		return math;	}
	public String getMajor() {		return major;	}
	@Override
	public String toString() {
		return "[name=" + name + ", eng=" + eng + ", math=" + math + ", major=" + major + "]";
	}
}

public class MyStreamEx01 {
	private static List<Student> list = 
			Arrays.asList(
				new Student("ȫ�浿", 55, 60, "�İ�"),
				new Student("�̸���", 95, 90, "�濵"), 
				new Student("���", 75, 80, "�ɸ�"), 
				new Student("�Ӳ���", 65, 70, "����"),
				new Student("������", 65, 0, "�İ�"));
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Student> st1 = list.stream();
		
		st1
		.filter(s->s.getEng() >= 60)
		.map((s)-> s.getName())
		.forEach(s -> System.out.println(s));
		System.out.println("=====================");
		
		Stream<Student> st2 = list.stream();
		int tot = st2
		.filter(s->s.getEng() >= 60)
		.map((s)-> s.getEng())
		.peek(s -> System.out.println(s))
		.reduce((a,b)->a+b)
		.get();
		System.out.println(tot);
	}

}
