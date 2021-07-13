package ch07_interface;
/*
 * jdk 8.0 이후에 인터페이스도 구현부를 가진 메서드를 멤버로 가질 수 있다.
 *   default 메서드 : 인스턴스멤버
 *    구현객체에  다중 구현이 가능하므로 똑같은 default 메서드가 존재할 수 있다.
 *    조건에 따라 오버라이딩 할 수 있다 
 *   static 메서드  :  클래스 멤버 
 */

interface Myinterface1{
	void method();
	default void method1() {
		System.out.println("Myyinterface1의 디폴트 메서드 : method1()");
	}
	static void staticMethod() {
		System.out.println("Myyinterface1의 static 메서드 : staticmethod()");
	}
}
interface Myinterface2{
	void method();
	default void method1() {
		System.out.println("Myyinterface2의 디폴트 메서드 : method1()");
	}
	static void staticMethod() {
		System.out.println("Myyinterface2의 static 메서드 : staticmethod()");
	}
}
class Parent{
	public void method2() {
		System.out.println("Parent 클래스의 멤버 메서드 : method()");
	}
}
class Child extends Parent implements Myinterface1, Myinterface2{

	@Override
	public void method1() {
		System.out.println("Child 클래스의 method1() 메서드");
	}
	@Override
	public void method() {
		System.out.println("Child 클래스의 method() 메서드");
		System.out.println("Myinterface1, Myinterface2 추상메서드 method를 오버라이딩함");
	}
}
/*
 * MyInterface1,MyInterface2 인터페이스의 method1 default 메서드가 충돌발생
 * => Child 클래스에서 반드시 오버라이딩 해야함.
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
