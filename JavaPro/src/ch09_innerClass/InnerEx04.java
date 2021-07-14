package ch09_innerClass;
interface I {
void test();
}
abstract class Abs{
	abstract void test();
}
public class InnerEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I i = new I() {
		int iv=100;
		
		@Override
		public void test() {
			System.out.println("iv= "+iv);
			System.out.println("this.iv= "+this.iv);
			System.out.println("I 내부 클래스의 test 메서드");
			}
		};
		
		i.test();
		int iv = 100;
		Abs a = new Abs() {
			@Override
			void test() {
				System.out.println("iv= "+iv);
				System.out.println("Abs 내부 클래스의 test 메서드");
			}
		};
		a.test();
	}
}