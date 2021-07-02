package ch04_Control;

import java.util.Scanner;

public class exam_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("층수를 입력하세요:");
		int a=scan.nextInt();
	
		for(int i=a; i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
        	}
        	System.out.println(" ");
		}
	}
}
