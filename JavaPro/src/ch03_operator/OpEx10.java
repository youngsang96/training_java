package ch03_operator;
/*
 * ���ǿ�����(���� ������)
 *   (���ǽ�)?�� : ����
 *   
 * ���ǿ����ڴ� ���ǹ����� ������ ������.  
 */

import java.util.Scanner;

public class OpEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ �Է��ϼ���");
		Scanner scan= new Scanner(System.in);
		int score = scan.nextInt();
		
		String result = (score >= 60) ? "�հ�" : "���հ�";
		System.out.println(score + "����" + result + "�Դϴ�.");
		
		System.out.println(score + "����" + ((score%2 == 0) ? "¦��" : "Ȧ��") + "�Դϴ�.");
		
		result = (score%2 == 1) ? "Ȧ��" : (score > 0) ? "¦��" : "0";
		
		System.out.println(score + "����" + result + "�Դϴ�.");
		
		String r;
		if (score >=60) {
			r = "�հ�";
		}else {
			r = "���հ�";
		}
		System.out.println(r);
	}

}
