package ch16_stream;
import java.util.*;
import java.util.stream.Stream;
import ch16_stream.Student4;
public class ListStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student4> list = Arrays.asList(
				new Student4("È«±æµ¿", 90),
				new Student4("½Å¿ë±Ç", 92),
				new Student4("³ªÀÚ¹Ù", 70),
				new Student4("±è¸ô¶ó", 65),
				new Student4("½Å¿ë±Ç", 87)
				);
		
		Stream<Student4> stream = list.stream();
		stream.forEach(s-> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + "_" + score);
		});
		System.out.println("=======================");
		Stream<Student4> stream2 = list.stream();
		double avg = stream2
				.mapToInt(s->s.getScore())
				.average()
				.getAsDouble();
		System.out.println(avg);
		
		System.out.println();
		System.out.println("stream");
		Stream<Student4> stream3 = list.stream();
		stream3.forEach(s->print(s));
		System.out.println("paralleStream");
		Stream<Student4> stream4 = list.stream();
		stream4.forEach(s->print(s));
	}

	public static void print(Student4 str) {
		System.out.println(str + Thread.currentThread().getName());
	}
}
