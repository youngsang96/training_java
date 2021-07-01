package ch03_operator;

import java.util.Scanner;

public class exam_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("사과의 갯수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		int a = (num%10 == 0) ? num/10 : (num/10 + 1);
		
		System.out.println("필요한 상자 개수 = " + a);
		
	}

}
