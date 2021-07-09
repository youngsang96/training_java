package ch06_oop;
class Parent{
	int x=10;
	Parent(int x){
		this.x=x;
	}
	Parent(){
		x=400;
	}
}
class Child2 extends Parent{
	int x=20;
	Child2(){
		
	}
	void method() {
		int x=30;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
}
public class SuperEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c= new Child2();
		c.method();
	}

}
