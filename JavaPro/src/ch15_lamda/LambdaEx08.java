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
			new Student("홍길동",90,80,"경영"),
			new Student("김삿갓",95,70,"컴공")};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("학생의 이름: ");
		printString(t->t.getName());
		System.out.print("전공의 이름: ");
		printString(t->t.getMajor());
		
		System.out.println("==========================");
		Function<Student, String> f2 = t->t.getName();
		printString(f2);
		printString(new Function<Student, String>(){
			@Override
			public String apply(Student t) {return t.getName();
		}});
		System.out.print("영어 점수: ");
		printInt(s->s.getEng());
		System.out.print("수학 점수: ");
		printInt(s->s.getMath());
		System.out.print("영어 점수 합계: ");
		printTot(t->t.getEng());
		System.out.print("수학 점수 합계: ");
		printTot(t->t.getMath());
		System.out.print("영어 점수 평균: ");
		printAvg(t->t.getEng());
		System.out.print("수학 점수 평균: ");
		printAvg(t->t.getMath());
	}

private static void printString(Function<Student,String> f) {
	for(Student s : list) {
		System.out.print(f.apply(s)+", ");
	}
	System.out.println();
}

private static void printInt(ToIntFunction<Student> f) {
	for(Student s : list) {
		System.out.print(f.applyAsInt(s)+", ");
	}
	System.out.println();
}

private static void printAvg(ToIntFunction<Student> f) {
	double sum=0;
	for(Student s : list) {
		sum+=f.applyAsInt(s);
	}
	System.out.println(sum/list.length);
}
private static void printTot(ToIntFunction<Student> f) {
	int sum=0;
	for(Student s : list) {
		sum +=f.applyAsInt(s);
	}
	System.out.println(sum);
}
}