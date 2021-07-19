package ch13_generic;

/* 제네릭  Method구현 : class 이용 하지 않고 메소드만을 제네릭으로 구현한다 
 * 실행 사용시 제네릭 생략가능함 
 * */

class Pool04<T>{
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}
class Util04{
	public static <T> Pool04<T> staticMethod(T t){
		Pool04<T> box = new Pool04<T>();
		box.set(t);
		return box;
	}
	public static <T> Pool04<T> instanceMethod1(T t){
		Pool04<T> box = new Pool04<T>();
		box.set(t);
		return box;
	}
	public <T> String instanceMethod2(T t){
		return t.toString();
	}
}
class MyCar{
	public String toString() {
		return "myCar";
	}
}
public class GenericEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pool04<Integer> box1= Util04.<Integer>staticMethod(100); //제네릭 생략가능
		int intvalue = box1.get();
		System.out.println(intvalue);
		
		Util04 u = new Util04();
		Pool04<String> box2 = u.<String>instanceMethod1("홍길동"); //생략가능
		String strValue = box2.get();
		System.out.println(strValue);
		System.out.println(u.instanceMethod2(100));
		System.out.println(u.instanceMethod2("김자바"));
		System.out.println(u.instanceMethod2(new MyCar()));
	}

}
