package ch16_stream;
import java.util.*;
import java.util.stream.Stream;

public class FlatMapEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String[]> strArrStrm = Stream.of(
				new String[]{"abc","def","jkl"},
		new String[]{"ABC","GHI","JKL"}
		);
		Stream<String> stream
		= strArrStrm.flatMap(s-> Arrays.stream(s));
		stream.forEach(s->System.out.println(s));
	}

}
