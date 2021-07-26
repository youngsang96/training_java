package ch16_stream;
import java.util.*;
import java.util.stream.IntStream;

public class MapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("È«±æµ¿Àü","ÃáÇâÀü","±¸¿î¸ù","Àü¿ìÄ¡Àü","»ç¾¾³²Á¤±â");
		
		System.out.println();
		IntStream isr = list.stream().mapToInt(String::length);
		isr.forEach(System.out::println);
		
		System.out.println();
		list.stream().mapToInt(s->s.length())
		.forEach(System.out::println);
	}

}
