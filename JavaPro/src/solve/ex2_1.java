package solve;
import java.util.Scanner;

public class ex2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] score = new int[5];
		int sum=0,max=0,min=Integer.MAX_VALUE;
		System.out.println(Integer.MAX_VALUE+","+Integer.MIN_VALUE);
		int arr[] = new int[5];
		int size= arr.length;
		
		for(int i=0; i<size; i++) {
			System.out.println("5명의 점수를 입력하세요");
			int value=scan.nextInt();
			arr[i] = value;
		}
		for(int a : arr) {
			sum+=a;
			if (min > a) {
				min=a;
			}
		}
		for(int a : arr) {
			if (max < a) {
				max=a;
			}
		}
		System.out.println("max= "+max+" sum= "+sum + " min= "+ min);
	}	
}