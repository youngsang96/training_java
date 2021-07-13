package ch07_interface;
/*
 * jdk 8.0 ���Ŀ� �������̽��� �����θ� ���� �޼��带 ����� ���� �� �ִ�.
 *   default �޼��� : �ν��Ͻ����
 *    ������ü��  ���� ������ �����ϹǷ� �Ȱ��� default �޼��尡 ������ �� �ִ�.
 *    ���ǿ� ���� �������̵� �� �� �ִ� 
 *   static �޼���  :  Ŭ���� ��� 
 */

interface Myinterface1{
	void method();
	default void method1() {
		System.out.println("Myyinterface1�� ����Ʈ �޼��� : method1()");
	}
	static void staticMethod() {
		System.out.println("Myyinterface1�� static �޼��� : staticmethod()");
	}
}
interface Myinterface2{
	void method();
	default void method1() {
		System.out.println("Myyinterface2�� ����Ʈ �޼��� : method1()");
	}
	static void staticMethod() {
		System.out.println("Myyinterface2�� static �޼��� : staticmethod()");
	}
}
class Parent{
	public void method2() {
		System.out.println("Parent Ŭ������ ��� �޼��� : method()");
	}
}
class Child extends Parent implements Myinterface1, Myinterface2{

	@Override
	public void method1() {
		System.out.println("Child Ŭ������ method1() �޼���");
	}
	@Override
	public void method() {
		System.out.println("Child Ŭ������ method() �޼���");
		System.out.println("Myinterface1, Myinterface2 �߻�޼��� method�� �������̵���");
	}
}
/*
 * MyInterface1,MyInterface2 �������̽��� method1 default �޼��尡 �浹�߻�
 * => Child Ŭ�������� �ݵ�� �������̵� �ؾ���.
 */

public class InterEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.method1();
		c.method2();
		Myinterface1.staticMethod();
		Myinterface2.staticMethod();
	}

}
