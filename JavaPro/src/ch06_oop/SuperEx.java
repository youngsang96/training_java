package ch06_oop;
/*
 * ��� ����
 * 
 * 1 �ڼհ�ü�� ��ü ������ �θ�ü�� ���� �����Ѵ�.
 * 2.�ڼհ�ü�� �θ� ��ü�� ����� ���� �� �� �ִ�.
 * 3.Ŭ�������� ����� ���� ��Ӹ� �����ϴ�.
 *   �ڼ�Ŭ������ �θ�� �Ѱ��� �����ϴ�.
 * 4.��� Ŭ������ Object Ŭ������ ��ӹ޴´�. 
 *   ��� ��ü�� Object Ŭ������ ��ü�� �����Ѵ�.
 *   ��� ��ü�� Object Ŭ������ ����� ������ �����ϴ�.   
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
