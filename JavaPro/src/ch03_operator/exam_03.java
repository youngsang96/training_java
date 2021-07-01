package ch03_operator;

import java.util.Scanner;

public class exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coin;
		System.out.println("금액을 입력하세요");
		Scanner scan = new Scanner(System.in);
		coin = scan.nextInt();
		
		int a = coin / 500;
		int b = (coin%500)/100;
		int c = ((coin%500)%100)/50;
		int d = (((coin%500)%100)%50)/10;
		int e = (((coin%500)%100)%50)%10;
		
		System.out.println("500원 " +a+ "개");
		System.out.println("100원 " +b+ "개");
		System.out.println("50원 " +c+ "개");
		System.out.println("10원 " +d+ "개");
		System.out.println("1원 " +e+ "개");
	}

}
