package solve;

import java.util.Scanner;

public class ex1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		int a=scan.nextInt();
		
		for (int i = 0; i < a; i++) { //�Է¹��� �ܸ�ŭ �ݺ��ϱ� ���� �ݺ���
            for (int j = 0; j < (a-i-1); j++) { //�ش� �࿡���� ������ ���� �ݺ���
                System.out.print(" ");
           	}	
            for (int k = 0; k < (i*2+1); k++) { //�ش� �࿡���� ���� ��� ���� �ݺ���
                System.out.print("*");
            }
            System.out.println();
        }
    }
}