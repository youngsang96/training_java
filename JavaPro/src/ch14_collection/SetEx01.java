package ch14_collection;
import java.util.HashSet;
import java.util.Set;

public class SetEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] arr = {"ȫ�浿",1,"1","���","�̸���","ȫ�浿","������","�����","ȫ�浿","���"};
		Set<Object> set1 = new HashSet<Object>();
		Set<Object> set2 = new HashSet<Object>();
		Set<Object> set3 = new HashSet<Object>();
		for(int i= 0; i <arr.length; i++) {
			if(!set1.add(arr[i])) {
				if(!set2.add(arr[i])) {
						set3.add(arr[i]);
					}		}			}
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
	}
}
