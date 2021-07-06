package solve;

import java.util.Scanner;

public class ex3_1 {

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
                    System.out.print((int)matrix[i][j]+" ");
                }              
            }
            System.out.println();
        }      
    }

	}
