package solve;

import java.util.Scanner;
/*
 * 화면에 삼각형 높이를 입력받고, 높이에 맞는 *로 삼각형 출력하기 
 * [결과]
  삼각형의 높이를 입력하세요
  삼각형 높이를 입력하세요 : 7
7
       *
      **
     ***
    ****
   *****
  ******
 *******
*/
public class ex1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("층수를 입력하세요:");
		int a=scan.nextInt();
		
		for (int i = 1; i <= a; i++) {
            for (int k = a; k > i; k--) {
                System.out.print(" ");                
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}