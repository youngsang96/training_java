package ch16_stream;
import java.util.*;

public class SortedEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student5> list = Arrays.asList(
				new Student5("ȫ�浿",1,89,56,66),
				new Student5("���",1,85,56,80),
				new Student5("�̸���",2,90,78,95),
				new Student5("�Ӳ���",3,60,56,88) );
		System.out.println("  �̸�  ��  ���� ����  ����  ����");
		list.stream()
		.sorted()
		.forEach(System.out::println);
		System.out.println();
		System.out.println("���� ���� �������� ����ϱ� : ���ٹ��");
		System.out.println("  �̸�  ��  ���� ����  ����  ����");
		list.stream()
		.sorted(new Comparator<Student5>() {
			@Override
			public int compare(Student5 s1, Student5 s2) {
				return s2.getEng()-s1.getEng();
			}
		})
		.forEach(System.out::println);
		System.out.println();
		System.out.println("�������� �������� ����ϱ� : ���ٹ��");
		System.out.println("  �̸�  ��  ���� ����  ����  ����");
		list.stream()
		.sorted((s1,s2)-> s2.getMath()-s1.getMath())
		.forEach(System.out::println);
		System.out.println();
		System.out.println("�հ����� �������� ����ϱ� : ���ٹ��");
		System.out.println("  �̸�  ��  ���� ����  ����  ����");
		list.stream()
		.sorted((s1,s2)-> s2.getScore()-s1.getScore())
		.forEach(System.out::println);
	}

}
