package ch04_Control;

import java.util.Scanner;

public class ControlEx5 {
	public static void main(String[] args) {
		//1. ��ǻ���� ������ �� ����
				/*Math.random() : ����. ������ �� ����
				        0 <= Math.random()  < 1.0 
				        0 <= Math.random() * 100 < 100.0 
				        0 <= (int)(Math.random() * 100) < 100 
				        1 <= (int)(Math.random() * 100) + 1 <= 100 
				 */

		int ans = (int)(Math.random() * 100) + 1;
		Scanner scan = new Scanner(System.in);
		int input;
		int cnt =0;
		do {
			System.out.println("1~100 ������ ���ڸ� �Է��ϼ���");
			input = scan.nextInt();
			if(ans > input) {
			System.out.println("�� ū �� �Դϴ�.");
			}else if (ans < input) {
				System.out.println("�� ���� �� �Դϴ�.");
			}else {System.out.println("�����Դϴ�");}
			cnt++;
		}while(ans != input);
		System.out.println("Ƚ��:"+cnt);
	}
}
