package ch06_oop;
import java.util.Date;
import temp.Pack2;
/*
 * package : Ŭ�������� ����.
 *    Ŭ�����̸��� ��Ű������ �����Ѵ�.
 *    package ������ ������ ó���� �ѹ��� ������ �����ϴ�. 
 *    => �ϳ��� ���Ͽ� �ִ� ��� Ŭ������ ���� ��Ű���� ���� Ŭ������.
 * 
 * import : ��Ű������ ������ �� �ֵ��� �̸� ���� Ŭ������ ��Ű���� �����ϴ� ����.
 * 
 * Ŭ������ �̸��� ������ �� �ִ� ���
 *   1. ���� ��Ű���� ���� Ŭ������ ��Ű������ ���� ������.
 *   2. java.lang ��Ű���� ���� Ŭ�������� ��Ű������ ���� ������.
 *   3. import �������� ������ Ŭ������ ��Ű���� ���� ����
 */

class Pack1{
	void method() {
		System.out.println("Pack1.method() ȣ���");
	}
}

public class PacakageEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pack1 p1=new Pack1();
		p1.method();
		Pack2 p2 = new Pack2(); //�ٸ� ��Ű���� Ŭ���� �ҷ�����(temp.Pack2 p2= new temp.Pack2();)
								// Ǯ�н��� import���� ��� ����
								//(temp.Pack2 p2= new temp.Pack2();)
		p2.method();
		Date d= new Date();
		System.out.println(d.toString());
	}

}
