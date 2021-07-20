package ch14_collection;
import java.util.*;

/* Iterator
 * it.hasNext() :������ �Էµ� �ּ�  ������ true
 * it.next()    :���� �ּ� return
*/

public class IteratorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("1"); list.add("21"); list.add("37");
		list.add("-5"); list.add("83");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
