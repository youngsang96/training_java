package ch04_Control;

import java.util.Scanner;
/*
 * ���� �ݺ�(����) : ���� ������� �ʴ� ���α׷�. 
 * ȭ�鿡�� ���ڸ� �Է¹ޱ�. 99999 ���� �ԷµǸ� �Է��� ������.
 * �Է� ����� ������ ���հ� ����� ���ϱ�
 */

public class ControlEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int cnt = 0;
		System.out.println("���ڸ� �Է��ϼ���(����:99999)");
		Scanner scan = new Scanner(System.in);
		while(true) {
			int num =scan.nextInt();
			if(num==99999) break;
			cnt++;
			sum += num;
			
		}
	System.out.println("���� :" + sum);
	System.out.println("��� :" + sum/cnt);
	}

}
