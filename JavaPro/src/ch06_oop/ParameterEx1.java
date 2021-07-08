package ch06_oop;
class Value{
	int val;
}


public class ParameterEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value v= new Value();
		v.val=100;
		change1(v.val);
		System.out.println("2:change1(이후): "+ v.val);
		change2(v);
		System.out.println("4:change2(1000:주소) 이후: "+v.val);
	}
	static void change1(int val) {
		val += 100;
		System.out.println("1:change1(): "+ val);
	}
	static void change2(Value v) {
		v.val += 100;
		System.out.println("3:change1(): "+ v.val);
	}
}
