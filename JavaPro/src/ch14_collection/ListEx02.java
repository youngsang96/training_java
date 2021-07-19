package ch14_collection;
import java.util.*;
public class ListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> list = new Vector<Double>();
		list.add(0.3); list.add(Math.PI);
		list.add(5.0);
		for(Object o : list) {System.out.println(o);}
		System.out.println("1: "+list);
		double num = 5.0;
		int index = list.indexOf(num);
		if(index >=0) System.out.println(num+"의 위치: "+ index);
		else System.out.println(num+"은 리스트에 없습니다");
		
		num = 0.3;
		System.out.println(list.indexOf(num));
		System.out.println(list.indexOf(5.0));
		System.out.println("삭제 전 : "+list);
		if(list.contains(num)) { //리스트에 num 존재여부
			list.remove(num);
			System.out.println(num+" 삭제됨");
		}
		System.out.println("삭제 후 : "+list);
		System.out.println("2: "+list);
		System.out.println(list.indexOf(num));
		System.out.println(list.indexOf(5.0));
		System.out.println(list);
	}

}
