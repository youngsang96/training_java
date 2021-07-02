package solve;

import java.util.Scanner;

/*
 * 10부터 99사이의 두자리 자연수를 입력받아 입력수보다 크거나 같은 가장 작은      
    10의배수에 입력수를 뺀 값을 출력하기 : 
 * [결과]
 * 10부터 99까지의 수를 입력하세요
 * 24
 * 30 - 24 = 6
 * 
 * 10부터 99까지의 수를 입력하세요
 * 20
 * 20 - 20 = 0
 * 
 * 10부터 99까지의 수를 입력하세요
 * 77
 * 80 - 77 = 3
 */
public class ex1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("10부터 99까지의 두자리수를 입력하세요");
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
