package ch04_Control;

import java.util.Scanner;
/* if ���� ���
 * Ű���忡�� �Ѱ��� ���ڸ� �Է¹޾Ƽ� �빮��, �ҹ���, ����, ��Ÿ������ ����ϱ� 
 * [���]
 * �Ѱ��� ���ڸ� �Է��ϼ���
 * A
 * �빮��  ('A' <= ch <= 'Z')
 * �Ѱ��� ���ڸ� �Է��ϼ���
 * c
 * �ҹ���  ('a' <= ch <= 'z')
 * �Ѱ��� ���ڸ� �Է��ϼ���
 * 3
 * ���� ('0' <= ch <= '9')
 * �Ѱ��� ���ڸ� �Է��ϼ���
 * -
 * ��Ÿ����  : �׿�.
 */

public class exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�Ѱ��� ���ڸ� �Է��ϼ���");
		Scanner scan=new Scanner(System.in);
		String str= scan.next();
		char ch= str.charAt(0);
		
		if('A' <= ch && 'Z' >=ch){
			System.out.println("�빮��");
		}else if('a' <= ch && ch<= 'z') {
			System.out.println("�ҹ���");
		}else if('0' <= ch && ch <= '9'){
			System.out.println("����");
		}else System.out.println("Ư������");
	}
}
