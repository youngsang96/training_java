package ch10_oop2;
import ch06_oop.Modifier2;
/*
 * 접근 제한자.
 *   private < (default) < protected < public
 *   class      package      상속        모두
 */

class Modifier{
	private int v1 = 100;
	int v2 = 200;
	protected int v3 = v1;
	
	public void method() {
		System.out.println("Modifier.method() 메서드");
		System.out.println("v1= " + v1);
		System.out.println("v2= " + v2);
	}
}
class Modifier3 extends Modifier2{
	public void method() {
		System.out.println("v3= " + v3);
		System.out.println("v4= " + v4);	}
}
public class ModifierEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifier m1 = new Modifier();
		//System.out.println(m1.v1); //접근불가
		System.out.println("m1.v2= "+m1.v2);
		System.out.println("m1.v3= "+m1.v3);
		m1.method();
		Modifier3 m3= new Modifier3();
		//System.out.println(m3.v1); //다른 패키지에 존재하는 클래스의 상
		//System.out.println(m3.v2); 
		//System.out.println(m3.v3);
		System.out.println("m3.v4= "+m3.v4 ); //public선언으로 접근 가능
		//Math m = new Math(); //생성자의 접근 제어자가 private이므로 객체생성 불가
	}

}
