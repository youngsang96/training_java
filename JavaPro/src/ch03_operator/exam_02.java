package ch03_operator;

import java.util.Scanner;

public class exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("세자리 정수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		System.out.println((num/100)*100);
	}

}
