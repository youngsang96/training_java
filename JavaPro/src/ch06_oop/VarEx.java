package ch06_oop;
/*
 * ���� ��ġ�� ���� ������ ����
 * Ŭ����(static) ���� : Ŭ���� ������ ����.
 *           static ������ ������
 *           Ŭ���� ������ �޸𸮿� �ε�ɶ� �����޸� �Ҵ�.
 *           ��üȭ(new �����ڷ� �ּһ��� )�� ���þ��� ������.
 *           �޸��Ҵ� ��ġ : Ŭ���� �޸𸮿���.
 *           Ŭ������ ��� ��ü�� ���� ������ ����.
 *           ��� : Ŭ������.������, ����������.������
 * �ν��Ͻ����� : Ŭ���� ������ �����
 *            �ڷ������� ������; �����.
 *            ��üȭ�� �޸� �Ҵ����.
 *            �ݵ�� ��üȭ �Ǿ�� ������ ����� �� ����
 *            �޸� �Ҵ� ��ġ : ������
 *            ��� : ����������.������            
 * ��������      : �޼��� ���ο��� �����.
 * (�Ű���������) �ʱ�ȭ�Ǿ����.
 *            ���������� ����ɶ� �޸� �Ҵ�.
 *            �޸��Ҵ� : ���ÿ���          
 *            ��� : ������ 
 */

class Sonata{
	String color; //�ν��Ͻ�����
	int number; //�ν��Ͻ�����
	static int width=250; //Ŭ��������
	static int height = 150; //Ŭ��������
	public String toString() {
		return color +":"+ number + "("+width +","+height+")";
	}
	}
public class VarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ڵ���ũ��: "+ Sonata.width +","+Sonata.height);
		Sonata car1= new Sonata();
		car1.color = "white"; car1.number=1234;
		Sonata car2= new Sonata();
		car2.color = "black"; car2.number=5678;
		System.out.println("car2: "+ car2);
		car2.width = 300;
		car2.height = 200;
		
		String temp="aaa:"+car1;
		System.out.println(temp);
		
		System.out.println("=====================");
		System.out.println("car1: "+ car1);
		System.out.println("car2: "+ car2);
	}

}
