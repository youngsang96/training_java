package ch06_oop;
/*
 * �ʱ�ȭ �� ����
 *  static �ʱ�ȭ �� :
 *      �ֿ��� : Ŭ���� ������ �ʱ�ȭ
 *      ����ñ� : Ŭ���� ������ �ε� �ǰ�, �ѹ� ����.
 *  �ν��Ͻ� �ʱ�ȭ ��
 *      �ֿ��� : �ν��Ͻ� ������ �ʱ�ȭ. �����ڿ� ����� ��ħ
 *      ���� �ñ�: ��ü ������ ������ ȣ������ ���� ȣ���.     
 *
 *  class�� call -> static ����  -> static block --> static method
 *  ��üȭ  -->instance ���� --> instance block ---> ������
 */

public class InitEx {
	static int cv; //Ŭ���� ����
	int iv; //�ν��Ͻ� ����
	InitEx(){ //������
		System.out.println("5. ������ȣ���");
	}
	static {
		cv = (int)(Math.random()*100);
		System.out.println("1. Ŭ���� �ʱ�ȭ �� cv= "+cv);
	}
	{ //�ν��Ͻ� �ʱ�ȭ ��
		iv=(int)(Math.random()*100);
		System.out.println("4. �ν��Ͻ� �ʱ�ȭ ��. �����ں��� ���� ȣ��� iv= "+iv);
	}
	public static void name() {
		System.out.println("name");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2. main �޼��� ����");
		System.out.println("3. main init1 ��ü ����");
		InitEx init1= new InitEx();
		name();
		System.out.println("main init2 ��ü ����");
		InitEx init2= new InitEx();
	}

}
