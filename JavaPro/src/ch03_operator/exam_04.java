package ch03_operator;

import java.util.Scanner;

public class exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("���� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		String result = (num > 0) ? "���" : (num < 0) ? "����" : "0";
		System.out.println(result);
	}

}
