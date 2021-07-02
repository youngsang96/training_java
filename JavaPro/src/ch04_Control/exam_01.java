package ch04_Control;

import java.util.Scanner;

public class exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num= scan.nextInt();
		
		if(num > 0) {System.out.println("양수");}
		else if(num < 0) {System.out.println("음수");}
		else System.out.println("0");
	}

}
