package ch09_innerClass;
/*
 * 내부 클래스 예제
 * 
 *  인스턴스 내부클래스 :  (static)클래스 멤버를 가질 수 없다. 단 상수는 가능 
 *  static 내부클래스 : (static)클래스 멤버를 가질 수 있다.
 *  지역내부클래스        : 메서드 내에 선언된 클래스. 메서드 내부에서만 사용이 가능함.
 *  이름없는(무명의)내부클래스 : 클래스 없이 객체화 가능한 클래스
 *                        추상클래스,인터페이스 의 객체화 가능함.
 *                        
                 
 */

class Outer1{
	class InstanceInner{ //인스턴스 내부 클래스
		//클래스 멤버를 가질수 없다.
		int iv = 100;
		final static int MAX=200; //상수는 클래스 멤버로 가질 수 있다.
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
		//LocalInner lc = new LocalInner(); => method()에서만 사용 가능.
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
