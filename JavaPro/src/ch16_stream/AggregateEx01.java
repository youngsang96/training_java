package ch16_stream;
import java.util.*;
import java.util.stream.*;
public class AggregateEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream s = Arrays.stream(new int[] {1,2,3,4,5});
		
		long count = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(n->n%2 ==0)
				.count();
		System.out.println("2의 배수 개수:" + count);
		
		long sum = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(n->n%2 ==0)
				.sum();
		System.out.println("2의 배수 합:" + sum);
		
		double avg = Arrays.stream(new int[] {1,2,3,4,5})
				.filter(n->n%2 ==0)
				.average()
				.getAsDouble();
		System.out.println("2의 배수의 평균:" + avg);
	}

}
