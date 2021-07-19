package ch13_generic;
/*
제네릭을 이용 
타입을 정하지 않고  class를 구현하는 방법이다 
class의 멤버, 메소드 파라메터, 리턴 타입, 인터페이스의 타입을 실행시에 적용 할 수 있다
실행 사용시 제네릭 생략가능함  

*/

class Pool02<T>{
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
}
public class GenericEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pool02<String> p = new Pool02<String>();
		p.set("hello");
		String str = p.get();
		System.out.println(str);
		Pool02<Integer> p2 = new Pool02<Integer>();
		p2.set(1);
		int value = p2.get();
		System.out.println(value);
	}

}
