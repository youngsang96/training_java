package ch09_innerClass;
class Outer3{
	int iv = 10;
	int iv2 = 20;
		class InstanceInner{
			int iv = 100;
			void method1() {
				System.out.println("iv= "+iv);
				System.out.println("this.iv= "+this.iv);
				this.iv=50;
				System.out.println("Outer3.this.iv= " +  Outer3.this.iv);
			}
		}
}
public class InnerEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer3 out = new Outer3();
		Outer3.InstanceInner ii = out.new InstanceInner();
		ii.method1();
	}

}
