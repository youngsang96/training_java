package ch02_var;

/*  �����ڿ� casting
 *  byte < short < int < long < float < double
 *         char
      ū�ڷ���=ū�ڷ��� + ���� �ڷ���  
      int = int ���� �ڷ��� + int ���� �ڷ��� 
      String = String + �⺻�ڷ���  
 */

public class VarEx21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1 = 10;
		long l1 = 1000;
		int i2 = (int)(i1 + l1);
		System.out.println("��ȣ:" + 1 + 2 + 1);
		System.out.println(1 + 2 + 3 +"��");
		char c3 = 'A';
		int i3 = c3;
		System.out.println("c3=" + c3 + ",i3=" + (char)i3);
		int b4; byte b5=1; byte b6 = 2;
		b5 = (byte)(b5 + b6);
	}

}
