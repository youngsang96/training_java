package ch06_oop;
/*
 * �����ڶ� ?
 *    ��üȭ�� ȣ��Ǵ� �޼���
 *    ������ ���� ��ü ������ �Ұ���.
 *    ����� �ν��Ͻ� ������ �ʱ�ȭ �����.
 *  
 * ������ ����
 *   1. �������� �̸��� Ŭ������� ����.
 *   2. ����Ÿ���� ������� �ʴ´�. 
 *   
 * �⺻������
 *   Ŭ������ �����ڸ� �ϳ��� �������� ������ �����Ϸ��� �߰����ִ� ������
 *   public Ŭ������(){} ������     
 */
class Number1{
	int num;
}
class Number2{
	int num;
	Number2(){}
	Number2(int x){
		num=x;
	}
}
public class ConstructorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number1 n1= new Number1();
		n1.num = 10;
		Number2 n2= new Number2();
		Number2 n3= new Number2(20);
		System.out.println("Number1 Ŭ������ num = "+ n1.num);
		System.out.println("Number2 Ŭ������ num = "+ n2.num);
		System.out.println("Number2 Ŭ������ num = "+ n3.num);
	}

}
