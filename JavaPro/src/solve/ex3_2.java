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
		    System.out.println("1 ���� 9 ������ ���ڸ� �Է��ϼ���." + " �������� -1  �Է��ϼ���.");
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
