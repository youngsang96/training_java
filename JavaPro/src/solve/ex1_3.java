package solve;

import java.util.Scanner;

public class ex1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int r= scan.nextInt();
		
		float a ,b=0;
		a = (float) (r*r*3.141592);
		b = (float) (2*r*3.141592);
		System.out.println("���� ���� :" + a + "���� �ѷ� :" + b);
	}

}
