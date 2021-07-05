package ch05_arr;
import java.util.Arrays;

public class ArrEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = {90,80,70};
		int score2[] = null;
		score2 = Arrays.copyOf(score, 5);
		for(int a : score2) {
			System.out.println(a);
		}
		System.out.println("Arrays.toString(score2)");
		System.out.println(Arrays.toString(score2));
	}
}
