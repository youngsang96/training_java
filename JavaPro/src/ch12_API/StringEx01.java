package ch12_API;

public class StringEx01 {
	/*
	 * String Ŭ���� ����
	 * 1. String Ŭ������ �����ϰ� ���ͷ������� ������ �ؼ� ��ü ������ ������.
	 *    ���ͷ������� �����Ҷ��� ���� ������ string ����� ���� ������ �ּҷ� ����� 
	 *    �ٸ� Ŭ������ ��ü��  new Ŭ������() ���·� ��ü������ ��.
	 * 2. final Ŭ������(�ٸ� Ŭ������ ��� ������ ����).
	 * 3. +������ ����� ������. + �������� ������� String ������ ����ȯ ����.
	 *    ��������.toString() ���� Ÿ���� ��ȯ�Ͽ� String���� ��ȯ�Ѵ� 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		if(s1 == s2)
			System.out.println("s1 == s2 : ���� ��ü");
		else System.out.println("s1 != s2 : �ٸ� ��ü");
		
		if(s1.equals(s2))
			System.out.println("s1.equals(s2) : ���� ����");
		else System.out.println("!(s1.equals(s2)) : �ٸ� ����");
		
		if(s3==s4)
			System.out.println("s3 == s4 : ���� ��ü");
		else System.out.println("s3 != s4 : �ٸ� ��ü");
		
		if(s3.equals(s4))
			System.out.println("s3.equals(s4) : ���� ����");
		else System.out.println("!(s3.equals(s4)) : �ٸ� ����");
		
		if(s2==s3)
			System.out.println("s2 == s3 : ���� ��ü");
		else System.out.println("s2 != s3 : �ٸ� ��ü");
		
		if(s2.equals(s3))
			System.out.println("s2.equals(s3) : ���� ����");
		else System.out.println("!(s2.equals(s3)) : �ٸ� ����");
		
		
	}

}
