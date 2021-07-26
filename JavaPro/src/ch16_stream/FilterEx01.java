package ch16_stream;
import java.util.*;
public class FilterEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("ȫ�浿","���", "ȫ�浿","�Ӳ���","ȫ�浿");
		list.stream().forEach(n->System.out.println(n));
		System.out.println();
		list.stream()
		.distinct()
		.forEach(n->System.out.println(n));
		
		System.out.println();
		list.stream()
		.filter(n->n.startsWith("ȫ"))
		.forEach(n->System.out.println(n));
		System.out.println();
		
		list.stream()
		.filter(n->n.startsWith("ȫ"))
		.distinct()
		.forEach(n->System.out.println(n));
		System.out.println();
	}

}
