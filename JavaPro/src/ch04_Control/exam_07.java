package ch04_Control;
/*
 * ȭ�鿡 �ﰢ�� ���̸� �Է¹ް�, ���̿� �´� *�� �ﰢ�� ����ϱ�
 * [���]
  �ﰢ���� ���̸� �Է��ϼ���
  3
    *
    **
    ***
�ﰢ���� ���̸� �Է��ϼ���
  5
    *    : 1
    **   : 2
    ***  : 3      
    **** : 4
    *****: 5
 */
import java.util.Scanner;

public class exam_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		int a=scan.nextInt();
	
		for(int i=1; i<=a;i++) {
        	for(int j=1;j<=i;j++) {
        		System.out.print("*");
        	}
        	System.out.println("");
		}
	}
}

