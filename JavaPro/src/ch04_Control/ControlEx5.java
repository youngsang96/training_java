package ch04_Control;

import java.util.Scanner;

public class ControlEx5 {
	public static void main(String[] args) {
		//1. 컴퓨터의 임의의 수 저장
				/*Math.random() : 난수. 임의의 수 리턴
				        0 <= Math.random()  < 1.0 
				        0 <= Math.random() * 100 < 100.0 
				        0 <= (int)(Math.random() * 100) < 100 
				        1 <= (int)(Math.random() * 100) + 1 <= 100 
				 */

		int ans = (int)(Math.random() * 100) + 1;
		Scanner scan = new Scanner(System.in);
		int input;
		int cnt =0;
		do {
			System.out.println("1~100 사이의 숫자를 입력하세요");
			input = scan.nextInt();
			if(ans > input) {
			System.out.println("더 큰 수 입니다.");
			}else if (ans < input) {
				System.out.println("더 작은 수 입니다.");
			}else {System.out.println("정답입니다");}
			cnt++;
		}while(ans != input);
		System.out.println("횟수:"+cnt);
	}
}
