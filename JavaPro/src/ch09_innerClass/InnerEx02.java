package ch09_innerClass;
//��������Ŭ�������� ���Ǵ� �޼����� ���������� ���ȭ(final) �Ǿ�� �Ѵ�.

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
