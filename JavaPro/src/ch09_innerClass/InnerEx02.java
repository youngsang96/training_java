package ch09_innerClass;
//지역내부클래스에서 사용되는 메서드의 지역변수는 상수화(final) 되어야 한다.

class Outer2{
	private static int outercv = 20;
	private int outeriv = 10;
	void method(int pv) {
		int i = 0;
		class LocalInner{
			int liv= outeriv;
			int liv2= outercv;
			void method() {
				System.out.println("i= "+i);
				System.out.println("pv= "+pv);
				System.out.println(liv+", "+liv2);
				System.out.println(outeriv + ", "+ outercv);
			}
		}
		LocalInner li = new LocalInner();
		li.method();
	}
}
public class InnerEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 out= new Outer2();
		out.method(1111);
	}

}
