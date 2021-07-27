package ch16_stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Student5> studentStream = Stream.of(
				new Student5("È«±æµ¿",1,89,56,66),
				new Student5("±è»ñ°«",1,85,56,80),
				new Student5("ÀÌ¸ù·æ",2,90,78,95),
				new Student5("ÀÓ²©Á¤",3,60,56,88),
				new Student5("ÀÓ²©Á¤",1,90,72,72));
		studentStream.sorted(
				Comparator.comparing(Student5::getBan)
				.thenComparing(Comparator.naturalOrder()))
				.forEach(System.out::println);
	}

}
