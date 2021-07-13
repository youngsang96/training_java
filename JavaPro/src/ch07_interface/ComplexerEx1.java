package ch07_interface;
/*
 * 인터페이스 
 * 1. 인터페이스의 멤버는 상수,추상메서드,default 메서드, static 메서드만 가능
 *    [public static final] 자료형 상수
 *    [public abstract] 자료형 메서드명();
 *    [public] default 자료형 메서드명() {} => jdk 8.0 이후에서만 가능
 *    [public] static 자료형 메서드명() {}  => jdk 8.0 이후에서만 가능
 * 2. 인터페이스의 멤버의 접근 제어자는 public
 * 3. 객체화 불가. => 구현클래스로 객체화가 된다.
 * 4. 클래스와 인터페이스간은 구현으로 표현한다.
 *     => 다중 구현이 가능함.
 * 5. 인터페이스간의 상속은 다중 상속이 가능하다.        
 */
interface Printerable{
	int INK = 100;
	void print();
}
interface Scannerable{ void scan();}
interface Faxable{
	String FAX_NO ="010-12345";
	void send(String tel);
	void receive(String tel);
}

interface Complexerable extends Printerable, Scannerable, Faxable{
	
}
class Complexer implements Complexerable{
	int ink;
	Complexer(){ink=INK;}
	@Override
	public void print() {
		System.out.println("종이에 출력합니다. 남은 잉크량:" + --ink);
	}

	@Override
	public void scan() {
		System.out.println("이미지를 스캔합니다.");
	}

	@Override
	public void send(String tel) {
		System.out.println(FAX_NO + "에서 " + tel + " 번호로 FAX를 전송");
	}

	@Override
	public void receive(String tel) {
		System.out.println(tel + "에서 " + FAX_NO + " 로 FAX를 수신");
	}
}

public class ComplexerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complexer com = new Complexer();
		System.out.println("기본 잉크량: "+ Printerable.INK);
		System.out.println("Fax 번호: " + Complexerable.FAX_NO);
	
		if(com instanceof Complexer) {
			System.out.println("com 참조변수의 객체는 complexer 입니다.");
			Complexer c = com;
		}
		System.out.println("===============Complexerable=================");
		if(com instanceof Complexerable) {
			System.out.println("com 참조변수의 객체는 Complexerable 입니다.");
			Complexerable c = com;
			c.print();
			c.scan();
			c.receive("02-5678");
			c.send("02-5678");
		}
		System.out.println("================Printerable================");
		if(com instanceof Printerable) {
			System.out.println("com 참조변수의 객체는 Printerable 입니다.");
			Printerable c = com;
			c.print();
		}
		System.out.println("================Scannerable================");
		if(com instanceof Scannerable) {
			System.out.println("com 참조변수의 객체는 Scannerable 입니다.");
			Scannerable c = com;
			c.scan();
		}
		System.out.println("================Faxable================");
		if(com instanceof Faxable) {
			System.out.println("com 참조변수의 객체는 Faxable 입니다.");
			Faxable c = com;
			c.receive("02-5678");
			c.send("02-5678");
		}

	}

}
