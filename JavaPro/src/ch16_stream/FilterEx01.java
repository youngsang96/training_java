package ch16_stream;
import java.util.*;
public class FilterEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("È«±æµ¿","±è»ñ°«", "È«±æµ¿","ÀÓ²©Á¤","È«±æµ¿");
		list.stream().forEach(n->System.out.println(n));
		System.out.println();
		list.stream()
		.distinct()
		.forEach(n->System.out.println(n));
		
		System.out.println();
		list.stream()
		.filter(n->n.startsWith("È«"))
		.forEach(n->System.out.println(n));
		System.out.println();
		
		list.stream()
		.filter(n->n.startsWith("È«"))
		.distinct()
		.forEach(n->System.out.println(n));
		System.out.println();
	}

}
