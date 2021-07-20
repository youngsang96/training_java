package ch14_collection;
import java.util.*;

/* Collections class
 * sort(List) : ��������� Ŭ������ �ݵ�� Comparable �������̽��� ������ Ŭ������ ������
 * sort(List, Comparator) : Comparable �������̽��� �������� ���� Ŭ������ ������
 
 */

public class ListEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> li = new ArrayList<Person>();
		li.add(new Person("ȫ�浿", 24));
		li.add(new Person("���", 44));
		li.add(new Person("������", 13));
		li.add(new Person("������", 31));
		li.add(new Person("������", 18));
		Person p1 = new Person("��ȣ��",27);
		li.add(p1);
		print(li);
		System.out.println("===========================");
		//Collections.sort(li); //Comparable
		Collections.sort(li, new Comparator<Person>() {
			
			public int compare(Person o1, Person o2) {
				//return (o1.age - o2.age)*1;
				return o1.name.compareTo(o2.name)*-1;
			}
	});
	print(li);
}
	public static void print(List li) {
		for(Object ob : li) {
			System.out.println(ob);
		}
	}
}
