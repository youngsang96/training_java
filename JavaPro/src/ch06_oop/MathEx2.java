package ch06_oop;

class Math2{
	int a, b;
	int x;
	
	int add1() {
		for(int i=0; i<5; i++) {int x=7;}
		System.out.println(x);
		return a+b; }
	static int add2(int a, int b) {
		int x=5;
		return a+b;
	}
	}

public class MathEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math2 m=new Math2();
		m.a=10; m.b=20;
		System.out.println(m.add1());
		System.out.println("1=====");
		System.out.println(Math2.add2(100,200));
		System.out.println(m.x);
		System.out.println("2=====");
		System.out.println(Math2.add2(100, 200));
	}

}
