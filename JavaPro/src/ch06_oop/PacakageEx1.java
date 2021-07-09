package ch06_oop;
import java.util.Date;
import temp.Pack2;
/*
 * package : 클래스들의 모임.
 *    클래스이름은 패키지명을 포함한다.
 *    package 설정은 파일의 처음에 한번만 설정이 가능하다. 
 *    => 하나의 파일에 있는 모든 클래스는 같은 패키지에 속한 클래스다.
 * 
 * import : 패키지명을 생략할 수 있도록 미리 사용될 클래스의 패키지를 선언하는 문장.
 * 
 * 클래스의 이름을 생략할 수 있는 경우
 *   1. 같은 패키지에 속한 클래스는 패키지명을 생략 가능함.
 *   2. java.lang 패키지에 속한 클래스들은 패키지명을 생략 가능함.
 *   3. import 구문으로 설정된 클래스는 패키지명 생략 가능
 */

class Pack1{
	void method() {
		System.out.println("Pack1.method() 호출됨");
	}
}

public class PacakageEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pack1 p1=new Pack1();
		p1.method();
		Pack2 p2 = new Pack2(); //다른 패키지의 클래스 불러오기(temp.Pack2 p2= new temp.Pack2();)
								// 풀패스로 import없이 사용 가능
								//(temp.Pack2 p2= new temp.Pack2();)
		p2.method();
		Date d= new Date();
		System.out.println(d.toString());
	}

}
