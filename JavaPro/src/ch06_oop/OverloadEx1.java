package ch06_oop;
/*
 * �����ε� ���� 
 *   ���� Ŭ���� ���ο� ���� �̸��� ���� �޼��尡 ������ ������ �� �ִ�.
 *   �� �Ű������� �ڷ����� ����, ����, Ÿ���� �޶�� �Ѵ�.=> �Ű������̸��� �ƴϰ� �ڷ������� �Ǵ���.
 */
class Math3{
	int a=100;
	int add(int b) { System.out.print("1:"); return a+b;}
	double add(float b) { System.out.print("2:"); return a+b;}
	double add(double b) { System.out.print("3:"); return a+b;}
	double add(long b) { System.out.print("4:"); return a+b;}
	String add(String b) {System.out.print("5:"); return a+b;}
}
public class OverloadEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Math3 m= new Math3();
		System.out.println(m.add(10));
		System.out.println(m.add(10.3));
		System.out.println(m.add("��"));
	}

}
