package ch16_stream;
import java.util.*;
import java.util.stream.*;
public class FlatMapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("자바 8 버전에","추가된 스트림을","열심히 공부하자");
		
		list.stream()
		.peek(s->System.out.println(s))
		.flatMap(data->Arrays.stream(data.split(" ")))
		.forEach(word -> System.out.println(word));
		System.out.println();
		
		List<String> list2 = Arrays.asList("10,20,30","40,50,60");
		IntStream isr = list2.stream().flatMapToInt(data->{
			String[] strArr = data.split(",");
			int[] intArr = new int[strArr.length];
			for(int i=0; i<strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr);
		});
		System.out.println(isr.average().getAsDouble());
	}

}
