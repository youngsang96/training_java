package ch04_Control;

import java.util.Scanner;

/*
 * if ���� ����. 
 *    
 *   if (���ǽ�1) {
 *      ���� 1.... : => ���ǽ�1�� ����� ���� ��� ���� �Ǵ� ����
 *   } else {
 *      ���� 2... : => ���ǽ�1�� ����� ������ ��� ���� �Ǵ� ����
 *   }
 *   
 *   if(���ǽ�1) {
 *      ���� 1.... : => ���ǽ�1�� ����� ���� ��� ���� �Ǵ� ����
 *   } else if(���ǽ�2) {
 *      ���� 2 ...   => ���ǽ�1�� ����� �����̰� ���ǽ�2�� ���� ��� ���� �Ǵ� ����
 *   } else if(���ǽ� 3) {
 *      ���� 3 => ���ǽ�1, ���ǽ�2�� ����� �����̰�, ���ǽ� 3�� ����� ���� ��� ����Ǵ� ����
 *   } ...
 *   } else {
 *      ����  => ��� if ������ ����� ������ ��� ����Ǵ� ����
 *   }
 *   
 *   ����Ǵ� ������ �ѹ��� �� ���  { } ���� ����
 */
public class ControlEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int score = scan.nextInt();
		
		if(score >=90) {
			System.out.println("A���� �Դϴ�.");
		}else if(score >=80) {
			System.out.println("B���� �Դϴ�.");
		}else if(score >= 70) {
			System.out.println("C���� �Դϴ�.");
		}else if(score >= 60) {
			System.out.println("D���� �Դϴ�.");
		}else System.out.println("F���� �Դϴ�.");
	}

}
