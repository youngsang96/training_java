package ch06_oop;
/*
 * 상속 예제
 * 
 * 1 자손객체의 객체 생성시 부모객체를 먼저 생성한다.
 * 2.자손객체는 부모 객체의 멤버에 접근 할 수 있다.
 * 3.클래스간의 상속은 단일 상속만 가능하다.
 *   자손클래스의 부모는 한개만 가능하다.
 * 4.모든 클래스는 Object 클래스를 상속받는다. 
 *   모든 객체는 Object 클래스의 객체를 포함한다.
 *   모든 객체는 Object 클래스의 멤버에 접근이 가능하다.   
 */

class Super{
	int x;
	Super(int x){
		this.x=x;
	}
}
class Child extends Super{
	int y;
	public Child() {
		super(10);
	}
}
public class SuperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c= new Child();
		System.out.println(c.x);
	}

}
