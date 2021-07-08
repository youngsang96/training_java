package solve;

import java.util.Scanner;

public class ex3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("홀수개의 배열 크기를 입력하세요");
		int num = scan.nextInt();
		char[][] matrix = new char[num][num];
		int number=0;
		int left = 0;
		int right = num-1;
		boolean chk = true;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(left<=j && j<=right) {	
					matrix[i][j]='*';
					number++;
				
				}
			}
			if (left==right) chk=false;
			if(chk) {	left++;	right--;}
			else {				left--; right++;}
		}
		
		
		
		//matrix 출력하기
		for(int i=0;i < matrix.length;i++) {
			for(int j=0; j< matrix[i].length;j++) {
				if(matrix[i][j]=='*') System.out.print(number--+ (number>9?" ":"  "));
				else System.out.print("   ");
			}
			System.out.println();
		}
    }

	}
