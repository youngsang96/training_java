package ch15_lamda;

import java.util.function.*;

class Student {
	private String name;
	private int eng;
	private int math;
	private String major;
	Student(){}
	public Student(String name, int eng, 
			int math, String major) {
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
}

public class LambdaEx08 {
	private static Student[] list = {
			new Student("ȫ�浿",90,80,"�濵"),
			new Student("���",95,70,"�İ�")};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�л��� �̸�: ");
		printString(t->t.getName());
		System.out.print("������ �̸�: ");
		printString(t->t.getMajor());
		
		System.out.println("==========================");
		Function<Student, String> f2 = t->t.getName();
		printString(f2);
		printString(new Function<Student, String>(){
			@Override
			public String apply(Student t) {return t.getName();
		}});
	}
private static void printString(Function<Student,String> f) {
	for(Student s : list) {
		System.out.print(f.apply(s)+", ");
	}
	System.out.println();
}
}
