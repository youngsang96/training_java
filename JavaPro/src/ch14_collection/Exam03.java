package ch14_collection;
import java.util.*;
public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Random ran = new Random();   
	     Set<Integer> set = new HashSet<Integer>();
	     while (set.size() < 6) { //�¿����� �̷��� 6�ڸ��� ���ڰ� ������������ �����ϸ� ��.
	         int num = ran.nextInt(45) + 1;
	         set.add(num);
	     }
	     System.out.println("======== Lotto ��ȣ =========");
	     System.out.println(set);     
	     List<Integer> list = new LinkedList<Integer>(set); 
		 Collections.sort(list);
		 System.out.println("������ : "+list);
	}
}



