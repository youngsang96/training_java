package ch04_Control;

import java.util.Scanner;

public class exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int num= scan.nextInt();
		
		if(num > 0) {System.out.println("���");}
		else if(num < 0) {System.out.println("����");}
		else System.out.println("0");
	}

}
