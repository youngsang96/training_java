package ch05_arr;

import java.util.Scanner;
//���� ��ȯ
public class ArrEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] binary = new char[32];
		int digit[] = {2,8,10,16};
		char[] hex=
			{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		Scanner scan = new Scanner(System.in);
		System.out.print("��ȯ�� 10���� �Է�:");
		int num = scan.nextInt();
		
		for(int a: digit) {
		int divnum = num, index =0;
		while(divnum !=0) {
			binary[index++] = hex[divnum%a];
			divnum/=a;
		}
		System.out.print(num + "��" +a+"���� : ");
		for(int i=index-1; i>=0; i--) {
			System.out.print(binary[i]);
		}
		System.out.println();
	}

	}
}