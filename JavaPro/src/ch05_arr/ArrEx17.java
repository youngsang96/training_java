package ch05_arr;
/*
2차원 배열을 이용하여  삼각형 출력하기
배열의 크기를 홀수개로 입력하세요 
5
    *****
     *** 
      *  
     *** 
    *****
3
     *** 
      *  
     *** 
*/

import java.util.Scanner;

public class ArrEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("홀수개의 배열크기를 입력하세요 :");
		int num=scan.nextInt();
		char[][] matrix = new char[num][num];
       
		int CENTER = (int) matrix.length/2 ; 
        int K=0; 
        int BEGIN = 0; 
        int END = matrix[0].length; 
        
        for(int ROW=0;ROW<matrix.length;ROW++){         
            if(ROW<=CENTER){
                BEGIN = ROW;
                END = (matrix[ROW].length -1) - ROW;
            }else{
                BEGIN = (matrix[ROW].length -1) - ROW;
                END = ROW;     
            }
            for(int COL=BEGIN;COL<=END;COL++){             
                K = K+1;
                matrix[ROW][COL] = (char) K;
            }              
        }      
        for(int i = 0; i<matrix.length;i++){        
            for(int j =0; j< matrix[i].length;j++){
                if(matrix[i][j] == 0) {
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }              
            }
            System.out.println();
        }      
    }
}


