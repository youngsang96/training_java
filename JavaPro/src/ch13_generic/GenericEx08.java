package ch13_generic;
import java.util.ArrayList;

public class GenericEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> t1 = new ArrayList<String>();
		t1.add("월매");
		t1.add("춘향");
		t1.add("향단");
		System.out.println(t1.get(2));
		System.out.println(t1.toString());
		
		ArrayList<Integer> t2 = new ArrayList<Integer>();
		t2.add(1); t2.add(2); t2.add(3); t2.add(4);
		t2.add(5); t2.add(6); t2.add(7);
		System.out.println(t2.get(6));
		System.out.println(t2.toString());
	}

}
