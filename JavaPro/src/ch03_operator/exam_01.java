package ch03_operator;

import java.util.Scanner;

public class exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		System.out.println("����� �ʸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		int min = num / 60;
		int hour = min / 60;
		int sec= num % 60;
		min = min%60;
		
		System.out.println(hour + "�ð� " + min +"�� " + sec +"��");
				
	}

}
