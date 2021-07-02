package solve;

import java.util.Scanner;

public class ex1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("층수를 입력하세요:");
		int a=scan.nextInt();
		
		for (int i = 0; i < a; i++) { //입력받은 단만큼 반복하기 위한 반복문
            for (int j = 0; j < (a-i-1); j++) { //해당 행에서의 공백을 위한 반복문
                System.out.print(" ");
           	}	
            for (int k = 0; k < (i*2+1); k++) { //해당 행에서의 별을 찍기 위한 반복문
                System.out.print("*");
            }
            System.out.println();
        }
    }
}