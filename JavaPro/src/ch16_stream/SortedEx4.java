package ch16_stream;
import java.util.*;
import java.util.Arrays;
import java.util.stream.*;

public class SortedEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream intstream = Arrays.stream(new int[] {5,3,2,1,4});
		intstream.sorted().forEach(n -> System.out.print(n +","));
		
		System.out.println();
		List<Student5> studentlist = 
				Arrays.asList(new Student5("È«±æµ¿",1,89,56,66),
				new Student5("±è»ñ°«",1,85,56,80),
				new Student5("ÀÌ¸ù·æ",2,90,78,95));
		System.out.println("defalut: ");
		studentlist
		.stream()
		.sorted().forEach(s->System.out.print(s.getScore()+", "));
		System.out.println();
		System.out.println("reverse: ");
		studentlist
		.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(s->System.out.print(s.getScore()+", "));
	}

}
