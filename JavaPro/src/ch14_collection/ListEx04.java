package ch14_collection;
import java.util.*;

/* Collections class
 * sort(List) : 사용자정의 클래스는 반드시 Comparable 인터페이스를 구현한 클래스만 가능함
 * sort(List, Comparator) : Comparable 인터페이스를 구현하지 않은 클래스도 가능함
 
 */

public class ListEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> li = new ArrayList<Person>();
		li.add(new Person("홍길동", 24));
		li.add(new Person("김삿갓", 44));
		li.add(new Person("이정민", 13));
		li.add(new Person("김윤민", 31));
		li.add(new Person("이지상", 18));
		Person p1 = new Person("이호연",27);
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
