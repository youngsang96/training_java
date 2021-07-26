package ch16_stream;
import java.util.*;
public class SortedEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("ȫ�浿","���","�̸���","�Ӳ���");
		list.stream().forEach(System.out::println);
		System.out.println();
		System.out.println("======�⺻����======");
		list.stream()
		.sorted()
		.forEach(System.out::println);
		System.out.println();
		System.out.println("=====�⺻�� ���� ����=====");
		list.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
	}

}
