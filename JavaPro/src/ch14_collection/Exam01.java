package ch14_collection;
import java.util.*;
public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(40);
		list.add(30);
		list.add(60);
		list.add(30);
		Collections.sort(list);
		for(Integer i : list) {
			sum+=i;
		}
		System.out.println("��հ� : " + sum/list.size());
		System.out.println("�߰��� : " + list.get((int) (list.size() / 2)));
	}

}
