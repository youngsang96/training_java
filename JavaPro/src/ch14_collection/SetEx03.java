package ch14_collection;
import java.util.*;

/*
 * TreeSet ���� 
 *     Set > SortedSet ����Ŭ����.
 *     Set : �ߺ��Ұ� :���ü
 *     SortedSet : ���ĵ�.
 *     
 *     => ��������� Ŭ������ �ݵ�� Comparable �������̽��� ������ Ŭ������
 *        TreeSet�� ��ҷ� ���� ����
 *     
 *  ���� ���� �������̽�
 *    - Comparator : �⺻ ���� ����� �߰��� �����Ҷ� ���
 *    - Comparable : �⺻ ���� ��� �����Ҷ� ���.  
 */

public class SetEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedSet<String> set = new TreeSet<>();
		//set = new TreeSet<>(new Descending());
		//set = new TreeSet<>(Comparator.reverseOrder());
		String from = "bat"; String to = "d";
		set.add("abc"); set.add("alien"); set.add("bat"); set.add("azz");
		set.add("car"); set.add("Car"); set.add("disc"); set.add("dance");
		System.out.println(set);
		System.out.println("from : "+ from + ", to : " + to);
		System.out.println(set.subSet(from, to));
		System.out.println("from : "+ from + ", to : " + to+" zzzz");
		System.out.println(set.subSet(from, to+"zzzz"));
	}
}
class Descending implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) {
		/*
		 * Comparable c1 = (Comparable)s1; Comparable c2 = (Comparable)s2; 
		 */
		return s1.compareTo(s2)* -1;
	}
}
