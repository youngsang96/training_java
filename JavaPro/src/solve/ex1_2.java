package solve;

import java.util.Scanner;

/*
 * 10���� 99������ ���ڸ� �ڿ����� �Է¹޾� �Է¼����� ũ�ų� ���� ���� ����      
    10�ǹ���� �Է¼��� �� ���� ����ϱ� : 
 * [���]
 * 10���� 99������ ���� �Է��ϼ���
 * 24
 * 30 - 24 = 6
 * 
 * 10���� 99������ ���� �Է��ϼ���
 * 20
 * 20 - 20 = 0
 * 
 * 10���� 99������ ���� �Է��ϼ���
 * 77
 * 80 - 77 = 3
 */
public class ex1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("10���� 99������ ���ڸ����� �Է��ϼ���");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			
			int result=0;
			if(num%10 !=0 ) {
			result = ((num/10)+1)*10 - num;
			}
			else result= num-num;
			System.out.println(result);
	}

}
