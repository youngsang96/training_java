package ch06_oop;

import java.util.Scanner;

public class OopEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("����� ���� �Է�: ");
		int n=scan.nextInt();
		System.out.println(n+"! = "+ factorial(n));
	}
	public static int factorial(int i) {
		System.out.println("i"+i);
		return (i==1)?1:i*factorial(i-1);
	}

}
