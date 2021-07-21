package ch14_collection;
import java.util.HashSet;
import java.util.Set;

/* 
 * Student클래스 구현하기
 * 1. 멤버변수 : 학번(studno), 이름(name), 전공(major)
 * 2. 멤버메서드 : toString()오버라이딩
 * 3. 학번과 이름이 같으면 같은 학생으로 인식하도록 오버라이딩 하기
 * 4. 생성자(학번(studno), 이름(name), 전공(major))
 */

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> set = new HashSet<Student>();
		set.add(new Student("1234","홍길동","경영"));
		set.add(new Student("2345","홍길순","경영"));
		set.add(new Student("2345","홍길순","컴공")); //추가불가
		set.add(new Student("1234","홍길동","통계")); //추가불가
		set.add(new Student("4567","홍길동","경영"));
		
		System.out.println("등록 학생 수: "+ set.size());
		System.out.println(set);
		System.out.println("==========================================");
		for(Student s : set) {
			System.out.println(s);
		}
	}

}
class Student{
	String studno;
	String name;
	String major;
	
	Student(String studno,String name,String major){
		this.studno=studno;
		this.name=name;
		this.major=major;
	}
	@Override
    public int hashCode() {
        return (studno+name).hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return name.equals(s.name) && studno.equals(s.studno);
        }
	@Override
	public String toString() {
		return "Student [studno=" + studno + ", name=" + name + ", major=" + major + "]";
	}
}
