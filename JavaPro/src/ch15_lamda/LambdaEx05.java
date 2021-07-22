package ch15_lamda;

interface LambdaInterface5{void method();}
class Outer{
	public int iv = 10;
	void method() {
		int iv = 40;
		LambdaInterface5 f5 = () -> {
			System.out.println("Oyter.this.iv: "+ Outer.this.iv);
			System.out.println("this.iv: "+this.iv);
			System.out.println("iv: "+ iv);
		};
		f5.method();
	}
}

public class LambdaEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		o.method();
	}

}
