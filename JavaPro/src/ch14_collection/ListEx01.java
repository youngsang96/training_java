package ch14_collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEx01 {

	public static void main(String[] args) {
			/*
			 * <Integer> : 제네릭표현 List<Integer> : 
			 * Integer 객체를 리스트에 저장함. 
			 * ArrayList : 가변배열. 저장할 갯수를 몰라도 객체를 저장. 첨자 사용 가능
			 */
			List<Integer> list = new ArrayList<Integer>();
			list.add(1);
			list.add(2);
			list.add(5);
			list.add(4);
			list.add(3);
			list.add(0);
			list.add(0);
			System.out.println(list);
			for(int i =0; i<list.size(); i++) {
				System.out.println(i + ": "+ list.get(i));
			}
			List<Integer> list2 = new ArrayList<Integer>(list.subList(1, 4));
			System.out.println(list2);
			Collections.sort(list2);
			System.out.println("sorted : "+ list2);
	}

}
