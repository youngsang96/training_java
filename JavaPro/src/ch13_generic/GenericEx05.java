package ch13_generic;
/*������ ������  ��ü�� �ڼ� (Child) class����  
 * ���׸� Ÿ������ �Է� �� �� �ֵ��� �����Ѵ�  
 * <T extends Number> Number�� �ڼո��� �Է� �� �� �ִ� 
 * (Wrapper �� ���� ������) 
  *  * */

class Pool05<T extends Number>{
	T v;
	
	Pool05(T n){
		v=n;
	}
	void set(T n) {
		v = n;
	}
	T get() {
		return v;
	}
}

class Util05 {
	public static < T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}
}
public class GenericEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result1 = Util05.<Integer>compare(10,20);
		System.out.println(result1);
		int result2 = Util05.compare(4.5, 3);
		System.out.println(result2);
		
		Pool05<Integer> p1 = new Pool05<Integer>(20);
		Pool05<Double> p2 = new Pool05<Double>(20.0);
		//Pool05<String> p3 = new Pool05<String>("hello");
		//Pool05<Character> p4 = new Pool05<Character>('a');
		Pool05<Byte> p5 = new Pool05<Byte>((byte) 1);
		int value = p1.get();
		System.out.println(value);
		System.out.println(p2.get());
	}

}
