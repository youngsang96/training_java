package solve;

import java.util.Scanner;
/*
 * ȭ�鿡 �ﰢ�� ���̸� �Է¹ް�, ���̿� �´� *�� �ﰢ�� ����ϱ� 
 * [���]
  �ﰢ���� ���̸� �Է��ϼ���
  �ﰢ�� ���̸� �Է��ϼ��� : 7
7
       *
      **
     ***
    ****
   *****
  ******
 *******
*/
public class ex1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		int a=scan.nextInt();
		
		for (int i = 1; i <= a; i++) {
            for (int k = a; k > i; k--) {
                System.out.print(" ");                
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}