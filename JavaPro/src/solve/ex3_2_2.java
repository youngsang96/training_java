package solve;

import javax.swing.JOptionPane;

public class ex3_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String neonNumber0[] = {"*****","*   *","*   *","*   *","*****"};
		  String neonNumber1[] = {" **  ","  *  ","  *  ","  *  "," *** "};
		  String neonNumber2[] = {"*****","    *","*****","*    ","*****"};
		  String neonNumber3[] = {"*****","    *","*****","    *","*****"};
		  String neonNumber4[] = {"  ** "," * * ","*  * ","*****","   * "};
		  String neonNumber5[] = {"*****","*    ","*****","    *","*****"};
		  String neonNumber6[] = {"*****","*    ","*****","*   *","*****"};
		  String neonNumber7[] = {"*****","*   *","*   *","    *","    *"};
		  String neonNumber8[] = {"*****","*   *","*****","*   *","*****"};
		  String neonNumber9[] = {"*****","*   *","*****","    *","    *"};
		  
		  String temp = " ";
		  while(true)
		  {
		   temp = JOptionPane.showInputDialog("1 에서 9 까지의 숫자를 입력하세요." + " 끝내려면 -1을 입력하세요.");
		   if(temp == null || temp.equals("-1")) break;
		   
		   System.out.println("입력값 : " + temp);
		   
		   for(int i = 0; i < 5; i++) // 각 네온숫자 배열은 5칸으로 구성
		   {
		     for(int j = 0; j < temp.length(); j++) // 본격 네온사인 출력문
		     {
		      char ch = temp.charAt(j); // 한글자씩 따서 자리마다 숫자를 Switch문으로 비교
		      switch (ch) {
		      case '0':
		       System.out.print(neonNumber0[i] + " ");
		       continue;
		      case '1':
		       System.out.print(neonNumber1[i] + " ");
		       continue;
		      case '2':
		       System.out.print(neonNumber2[i] + " ");
		       continue;
		      case '3':
		       System.out.print(neonNumber3[i] + " ");
		       continue;
		      case '4':
		       System.out.print(neonNumber4[i] + " ");
		       continue;
		      case '5':
		       System.out.print(neonNumber5[i] + " ");
		       continue;
		      case '6':
		       System.out.print(neonNumber6[i] + " ");
		       continue;
		      case '7':
		       System.out.print(neonNumber7[i] + " ");
		       continue;
		      case '8':
		       System.out.print(neonNumber8[i] + " ");
		       continue;
		      case '9':
		       System.out.print(neonNumber9[i] + " ");
		       continue;
		      }
		     }
		     System.out.println();
		   }
		  }

	}

}
