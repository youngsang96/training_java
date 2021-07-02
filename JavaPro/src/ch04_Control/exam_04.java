package ch04_Control;

import java.util.Scanner;

public class exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("자연수를 입력하세요:");
		int num=scan.nextInt();
		int sum = 0;
		
		/* for(l num!=0; num/=10){
		 * sum += num%10
		 * }
		 */
		while(num!=0){
            sum += num%10;
            num /= 10;
        }
		System.out.println("자리수 합 = "+ sum);
	}

}
