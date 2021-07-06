package solve;
import java.util.Scanner;

public class ex3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int temp = 0;
		 char[][][] digits = {
				 {
					    { ' ','*','*',' ' },
				        { '*',' ',' ','*' },
				        { '*',' ',' ','*' },
				        { '*',' ',' ','*' },
				        { ' ','*','*',' ' }
				 },
				 {
					    { ' ','*','*',' ' },
				        { '*',' ','*',' ' },
				        { ' ',' ','*',' ' },
				        { ' ',' ','*',' ' },
				        { '*','*','*','*' }
				 }
		 };
		  Scanner scan = new Scanner(System.in);
		  while(true)
		  {
		    System.out.println("1 에서 9 까지의 숫자를 입력하세요." + " 끝내려면 -1  입력하세요.");
		    temp= scan.nextInt();
		    for(int i=0; i < digits[temp].length; i++) {
			System.out.println(digits[temp][i]);
			   }
		   if(temp == -1) {
			   System.out.println("end");
			   break;
		   }
		   }
			 
		}
	}
