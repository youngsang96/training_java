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
			System.out.println("p �������� ��ü�� Child4 �̴�.");
			Child4 c=(Child4) p;
			System.out.println(c.x);
			c.method();
		}
		if(p instanceof Parent4) {
			System.out.println("p �������� ��ü�� Parent4 �̴�.");
		}
		if(p instanceof Object) {
			System.out.println("p �������� ��ü�� Object ��ü�̴�.");
			Object o=p;
			System.out.println(p.x);
			//System.out.println(o.x);
				//x�� Object Ŭ������ ����� �ƴϱ� ������ ������ �� ����.
		}
	}

}
