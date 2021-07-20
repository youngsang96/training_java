package ch14_collection;
import java.util.*;

/*
 * TreeSet 예제 
 *     Set > SortedSet 구현클래스.
 *     Set : 중복불가 :동등객체
 *     SortedSet : 정렬됨.
 *     
 *     => 사용자정의 클래스는 반드시 Comparable 인터페이스를 구현한 클래스만
 *        TreeSet에 요소로 저장 가능
 *     
 *  정렬 관련 인터페이스
 *    - Comparator : 기본 정렬 방식을 추가로 변경할때 사용
 *    - Comparable : 기본 정렬 방식 지정할때 사용.  
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
