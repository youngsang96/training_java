package ch02_var;
/*
 * ����ȯ ����  
 *   ū�ڷ���<=���� �ڷ��� : �ڵ�����ȯ
 *   �����ڷ��� <= ū�ڷ��� : ����� ����ȯ
 *   byte < short < int < long < float < double
 *          char
 *          
 *  A=B : ���� �� �ǹ̰� �ƴϰ�, ������ �ǹ���.
 *        B�� ���� A�� �Է���.
 *  lvalue : ���Կ������� ������ ��. �ݵ�� ����������.
 *  rvalue : ���Կ������� �������� ��, ����, ���ͳ�, ���� ����             
 */

public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		String s = "a";
		byte b1 = (byte) 255;
		int i1 = b1;
		byte b2 = (byte) 11;
		System.out.println("b1=" + b1 + ", i1=" + i1);
		byte b3 = 100;
		System.out.println("b3=" + b3);
		long l1 = 10;
		float f1 = l1;
		long l2 = (long) f1;
		char c1 = 'A';
		short s1 = (short) c1;
		char c2 = (char) b1;
		
	}

}
