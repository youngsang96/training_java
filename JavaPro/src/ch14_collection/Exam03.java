package ch14_collection;
import java.util.*;
public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Random ran = new Random();   
	     Set<Integer> set = new HashSet<Integer>();
	     while (set.size() < 6) { //셋에서는 이렇게 6자리의 숫자가 정해질때까지 추출하면 됨.
	         int num = ran.nextInt(45) + 1;
	         set.add(num);
	     }
	     System.out.println("======== Lotto 번호 =========");
	     System.out.println(set);     
	     List<Integer> list = new LinkedList<Integer>(set); 
		 Collections.sort(list);
		 System.out.println("정렬후 : "+list);
	}
}



