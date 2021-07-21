package ch14_collection;
import java.util.HashSet;
import java.util.Set;

/* 
 * StudentŬ���� �����ϱ�
 * 1. ������� : �й�(studno), �̸�(name), ����(major)
 * 2. ����޼��� : toString()�������̵�
 * 3. �й��� �̸��� ������ ���� �л����� �ν��ϵ��� �������̵� �ϱ�
 * 4. ������(�й�(studno), �̸�(name), ����(major))
 */

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> set = new HashSet<Student>();
		set.add(new Student("1234","ȫ�浿","�濵"));
		set.add(new Student("2345","ȫ���","�濵"));
		set.add(new Student("2345","ȫ���","�İ�")); //�߰��Ұ�
		set.add(new Student("1234","ȫ�浿","���")); //�߰��Ұ�
		set.add(new Student("4567","ȫ�浿","�濵"));
		
		System.out.println("��� �л� ��: "+ set.size());
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
