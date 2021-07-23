package ch15_lamda;
import java.util.*;
import java.util.function.Predicate;
/*
 * Predicate �������̽� : 
 * �Ű����� ����, ���ϰ��� boolean �� �Լ� test �޼��带 ������ ����.
 * �Ű��� ������ true �Ǵ� false�� ������ �� ���
 */
public class LambdaEx10 {

	private static List<Student> list = 
			Arrays.asList(
				new Student("ȫ�浿", 55, 60, "�İ�"),
				new Student("�̸���", 95, 90, "�濵"), 
				new Student("���", 75, 80, "�ɸ�"), 
				new Student("�Ӳ���", 65, 70, "����"),
				new Student("������", 65, 0, "�İ�"));

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� ������ 60�� �̻��� �л��� ���� ���:" + avg1(s -> s.getEng() >= 60));
		System.out.println("���� ������ 60�� �̻��� �л��� ���� ���:" + avg2(s -> s.getMath() >= 60));
		System.out.println("�İ��� �л��� ���� ���: "+ avgEng(s->s.getMajor().equals("�İ�")));
		System.out.println("�İ����� �ƴ� �л��� ���� ���: "+ avgEng(s->!s.getMajor().equals("�İ�")));
		System.out.println("�İ��� �л��� �̸� ����Ʈ: "+ nameList(s->s.getMajor().equals("�İ�")));
		System.out.println("�İ����� �ƴ� �л��� �̸� ����Ʈ: "+ nameList(s->!s.getMajor().equals("�İ�")));
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
