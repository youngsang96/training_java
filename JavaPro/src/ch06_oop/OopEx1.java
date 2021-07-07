package ch06_oop;
/*
 * �߻�ȭ : Ŭ���� ���� ����.
 * Ŭ���� : ����� ���� �ڷ���.
 *   �Ӽ� : �������
 *   ��� : ����޼���
 */
class Phone{
	String color;
	boolean power;
	String no;
	
	void power() {
		power= !power;
	}
	void send(String no){
		System.out.println(no + "�� ��ȭ �۽���");
	}
	void receive(String no){
		System.out.println(no + " ��ȭ ������");
	}
}

public class OopEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Phone p1; => �������� ����
		// new Phone() => ��ü ����. ��üȭ, �ν��Ͻ�ȭ
		// new ����� : ��ü ���� ���. �޸� �Ҵ���.
		// String�� ������ ��� Ŭ������ ��ü ������ new �����ڷ� ������
		Phone p1= new Phone(); 
		p1.color = "����";
		p1.power = true;
		System.out.println(p1.color +","+p1.power+","+p1.no);
		p1.send("010-****-****");
		p1.receive("010-****-****");
		Phone p2= new Phone();
		/*
		 * new ����� ��� 
		 * 1. �������� �޸� �Ҵ�. 
		 * 2. ��������� �⺻������ �ʱ�ȭ �⺻�� : ���� : 0, boolean : false,�׿� : null 
		 * 3. ������ ȣ�� ���
		 */
		System.out.println(p2.color +","+p2.power+","+p2.no);
		p2=p1;
		/*
		 * p1 ��ü�� p2 ��ü�� ���� ��ü��. 
		 * �ϳ��� ��ü�� �ΰ��� ���������� ������ ������. 
		 * �ϳ��� ���������� �ΰ��� ��ü�� ���� �Ұ�����.
		 */
		System.out.println(p2.color +","+p2.power+","+p2.no);
	}

}
