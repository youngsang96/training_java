package ch06_oop;
class Parent4{
	int x=10;
}
class Child4 extends Parent4{
	void method() {
	System.out.println("child method");
	}
}

public class InstanceOfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent4 p=new Parent4();
		if(p instanceof Child4) {
			System.out.println("p 참조변수 객체는 Child4 이다.");
			Child4 c=(Child4) p;
			System.out.println(c.x);
			c.method();
		}
		if(p instanceof Parent4) {
			System.out.println("p 참조변수 객체는 Parent4 이다.");
		}
		if(p instanceof Object) {
			System.out.println("p 참조변수 객체는 Object 객체이다.");
			Object o=p;
			System.out.println(p.x);
			//System.out.println(o.x);
				//x는 Object 클래스의 멤버가 아니기 때문에 접근할 수 없다.
		}
	}

}
