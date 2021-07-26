package ch16_stream;
import java.util.*;
public class SortedEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("È«±æµ¿","±è»ñ°«","ÀÌ¸ù·æ","ÀÓ²©Á¤");
		list.stream().forEach(System.out::println);
		System.out.println();
		System.out.println("======±âº»Á¤·Ä======");
		list.stream()
		.sorted()
		.forEach(System.out::println);
		System.out.println();
		System.out.println("=====±âº»ÀÇ ¿ª¼ø Á¤·Ä=====");
		list.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
	}

}
