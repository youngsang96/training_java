package ch03_operator;

import java.util.Scanner;

public class exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin;
		System.out.println("�ݾ��� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		coin = scan.nextInt();
		
		int a = coin / 500;
		int b = (coin%500)/100;
		int c = ((coin%500)%100)/50;
		int d = (((coin%500)%100)%50)/10;
		int e = (((coin%500)%100)%50)%10;
		
		System.out.println("500�� " +a+ "��");
		System.out.println("100�� " +b+ "��");
		System.out.println("50�� " +c+ "��");
		System.out.println("10�� " +d+ "��");
		System.out.println("1�� " +e+ "��");
	}

}
