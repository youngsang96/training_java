package ch15_lamda;
import java.util.*;
import java.util.function.Predicate;
/*
 * Predicate 인터페이스 : 
 * 매개변수 존재, 리턴값은 boolean 인 함수 test 메서드를 가지고 있음.
 * 매개값 조사해 true 또는 false를 리턴할 때 사용
 */
public class LambdaEx10 {

	private static List<Student> list = 
			Arrays.asList(
				new Student("홍길동", 55, 60, "컴공"),
				new Student("이몽룡", 95, 90, "경영"), 
				new Student("김삿갓", 75, 80, "심리"), 
				new Student("임꺽정", 65, 70, "전자"),
				new Student("성춘향", 65, 0, "컴공"));

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("영어 점수가 60점 이상인 학생의 영어 평균:" + avg1(s -> s.getEng() >= 60));
		System.out.println("영어 점수가 60점 이상인 학생의 영어 평균:" + avg2(s -> s.getMath() >= 60));
		System.out.println("컴공과 학생의 영어 평균: "+ avgEng(s->s.getMajor().equals("컴공")));
		System.out.println("컴공과가 아닌 학생의 영어 평균: "+ avgEng(s->!s.getMajor().equals("컴공")));
		System.out.println("컴공과 학생의 이름 리스트: "+ nameList(s->s.getMajor().equals("컴공")));
		System.out.println("컴공과가 아닌 학생의 이름 리스트: "+ nameList(s->!s.getMajor().equals("컴공")));
	}

	public static double avg1(Predicate<Student> pr) {
		int count=0, sum=0;
		for(Student s : list) {
			if(pr.test(s)) {
				count++;
				sum+=s.getEng();
			}
		}
		
		return (double) sum/count;
	}
	public static double avg2(Predicate<Student> pr) {
		int count=0, sum=0;
		for(Student s : list) {
			if(pr.test(s)) {
				count++;
				sum+=s.getMath();
			}
		}
		return (double) sum/count;
	}
	public static double avgEng(Predicate<Student> pr) {
		int count=0, sum=0;
		for(Student s : list) {
			if(pr.test(s)) {
				count++;
				sum+=s.getEng();
			}
		}
		
		return (double) sum/count;
	}
	public static String nameList(Predicate<Student> pr) {
		String line="";
		for(Student s : list) {
			if(pr.test(s)) {
				line += s.getName()+", ";
			}
		}
		
		return line;
	}
}
