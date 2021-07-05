package ch04_Control;

import java.util.Scanner;
/*입력된 포인트에 가능한 모든 상품을 프린트 하세요
 * 0 ~ 199 : 상품이 없습니다
 * 200 ~ 399 : 새우깡
 * 400 ~ 599 : 핸드폰
 * 600 ~ 799 : 자동차
 * 800 ~ 999 : 아파트
 * 
 *  850 :  아파트,자동차,핸드폰,새우깡
 *  730 :  컴퓨터,핸드폰,새우깡
 *  160 :  상품이 없습니다
*/
public class exam_09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("포인트를를 입력하세요:");
		int point = 0;
		while(true){
			point=scan.nextInt();
			if(point == 9999) {
				System.out.println("exit");
			break;}
			
			System.out.println(point+"점");
			switch(point/200) {
			case 0 : System.out.println("상품이 없습니다."); break;
			case 4 : System.out.print("아파트,");
			case 3 : System.out.print("자동차,");
			case 2 : System.out.print("핸드폰,");
			case 1 : System.out.println("새우깡");	
			}
		}
	}
}