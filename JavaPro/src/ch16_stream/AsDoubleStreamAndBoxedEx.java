package ch16_stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedEx {
static int sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {1,2,3,4,5};
		
		IntStream intStream = Arrays.stream(intArray);
		intStream
		.asDoubleStream()
		.forEach(d -> System.out.println(d));
		System.out.println();
		
		intStream = Arrays.stream(intArray);
		intStream
		.boxed()
		.forEach(obj -> System.out.println(obj.intValue()));
		
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a->sum+=a);
		System.out.println("����: "+ sum);
		sum=0;
		System.out.println();
		stream = IntStream.range(1, 100);
		stream.forEach(a->sum+=a);
		System.out.println("����: "+ sum);
	}

}
