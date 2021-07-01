package ch02_var;

/*  연산자와 casting
 *  byte < short < int < long < float < double
 *         char
      큰자료형=큰자료형 + 작은 자료형  
      int = int 이하 자료형 + int 이하 자료형 
      String = String + 기본자료형  
 */

public class VarEx21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1 = 10;
		long l1 = 1000;
		int i2 = (int)(i1 + l1);
		System.out.println("번호:" + 1 + 2 + 1);
		System.out.println(1 + 2 + 3 +"번");
		char c3 = 'A';
		int i3 = c3;
		System.out.println("c3=" + c3 + ",i3=" + (char)i3);
		int b4; byte b5=1; byte b6 = 2;
		b5 = (byte)(b5 + b6);
	}

}
