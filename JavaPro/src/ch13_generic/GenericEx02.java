package ch13_generic;
/*
���׸��� �̿� 
Ÿ���� ������ �ʰ�  class�� �����ϴ� ����̴� 
class�� ���, �޼ҵ� �Ķ����, ���� Ÿ��, �������̽��� Ÿ���� ����ÿ� ���� �� �� �ִ�
���� ���� ���׸� ����������  

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
