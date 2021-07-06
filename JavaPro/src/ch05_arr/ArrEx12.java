package ch05_arr;
import java.util.Scanner;
/*
 * 야구 게임
 * 1)  시스템이 4자리의 서로 다른 수를 저장한 후
 * 2)  사용자가 저장된 수를 맞추는 게임
 *     자리수도 맞는 경우 : 스트라익
 *     자리수는 틀리지만 숫자가 존재하면 : 볼
 *     4스트라익이 되면 정답
 */

public class ArrEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int[] com=new int[4]; 
		int[] user=new int[4]; 
		Scanner scan = new Scanner(System.in); 
		
		for(int i =0; i<4; i++) { 
			com[i]= (int)((Math.random()*9)+1); 
		for(int j =0; j<i; j++) { 
			if(com[i]==com[j]) { 
				i--; 
				break; 
				} 
			} 
		}
		for(int a:com) {
		System.out.print(a+" ");
		}
		System.out.println();
		while(true) {
			System.out.print("서로다른 4자리 수를 입력하세요: ");
			String input=scan.next();
			for(int i=0; i<user.length; i++) {
				user[i]=input.charAt(i)-'0';
			}
			int str=0;
			int ball=0;
			for(int i=0; i<com.length; i++) {
				for(int j=0; j<user.length; j++) {
					if(com[i] == user[j]) {
						if(i == j) {
							str++;
						}else {ball++;}
					}
				}
			}
		System.out.println(str+"s "+ ball+"b");
		if(str==4) {
			System.out.println("정답");
			break;}
		}
	}
}


