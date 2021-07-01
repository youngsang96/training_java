package ch03_operator;
/*
 * 조건연산자(삼항 연산자)
 *   (조건식)?참 : 거짓
 *   
 * 조건연산자는 조건문으로 변경이 가능함.  
 */

import java.util.Scanner;

public class OpEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수를 입력하세요");
		Scanner scan= new Scanner(System.in);
		int score = scan.nextInt();
		
		String result = (score >= 60) ? "합격" : "불합격";
		System.out.println(score + "점은" + result + "입니다.");
		
		System.out.println(score + "점은" + ((score%2 == 0) ? "짝수" : "홀수") + "입니다.");
		
		result = (score%2 == 1) ? "홀수" : (score > 0) ? "짝수" : "0";
		
		System.out.println(score + "점은" + result + "입니다.");
		
		String r;
		if (score >=60) {
			r = "합격";
		}else {
			r = "불합격";
		}
		System.out.println(r);
	}

}
