package ch14_collection;
import java.util.*;

/*
 * ���� ���� �������̽�
 * Comparable �������̽� : �߻�޼��� compareTo(Object)
 *                      Ŭ������ �⺻ ���� ��� ���� 
 * Comparator �������̽� : �߻�޼��� compare(Object o1, Object o2)
 *                      �⺻���� ��� ��� �������� �ʰ� ����ڰ� ���Ƿ� ���� ����� ����                     
 */

public class SetEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���̼����� ���");
		TreeSet<Person> set = new TreeSet<>(new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p1.age - p2.age;
			}
		});
		set.add(new Person("ȫ�浿",33));
		set.add(new Person("���",22));
		set.add(new Person("�̸���",55));
		System.out.println(set);
		
		System.out.println("���� �������� ���");
		set = new TreeSet<>(new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return p2.age - p1.age;
			}
		});
		set.add(new Person("ȫ�浿",33));
		set.add(new Person("���",22));
		set.add(new Person("�̸���",55));
		System.out.println(set);
	}

}
