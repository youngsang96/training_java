package ch09_innerClass;
/*
 * ���� Ŭ���� ����
 * 
 *  �ν��Ͻ� ����Ŭ���� :  (static)Ŭ���� ����� ���� �� ����. �� ����� ���� 
 *  static ����Ŭ���� : (static)Ŭ���� ����� ���� �� �ִ�.
 *  ��������Ŭ����        : �޼��� ���� ����� Ŭ����. �޼��� ���ο����� ����� ������.
 *  �̸�����(������)����Ŭ���� : Ŭ���� ���� ��üȭ ������ Ŭ����
 *                        �߻�Ŭ����,�������̽� �� ��üȭ ������.
 *                        
                 
 */

class Outer1{
	class InstanceInner{ //�ν��Ͻ� ���� Ŭ����
		//Ŭ���� ����� ������ ����.
		int iv = 100;
		final static int MAX=200; //����� Ŭ���� ����� ���� �� �ִ�.
	}
	static class StaticInner{
		int iv = 300;
		static int cv = 400;
		final static int MAX = 500;
	}
	void method() {
		class LocalInner{
			int iv = 600;
			final static int MAX = 700;
		}
		LocalInner lc = new LocalInner();
		System.out.println(lc.iv);
		System.out.println(lc.MAX);
		System.out.println(LocalInner.MAX);
	}
	void Method2() {
		//LocalInner lc = new LocalInner(); => method()������ ��� ����.
	}
}
public class InnerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1.StaticInner si = new Outer1.StaticInner();
		System.out.println(si.iv);
		System.out.println(Outer1.StaticInner.cv); //400
		System.out.println(Outer1.StaticInner.MAX); //500
		Outer1.InstanceInner ii= new Outer1().new InstanceInner();
		Outer1 outer = new Outer1();
		Outer1.InstanceInner ii2= outer.new InstanceInner();
		System.out.println(ii2); //100
		System.out.println(Outer1.InstanceInner.MAX);
		outer.method();
	}
}
