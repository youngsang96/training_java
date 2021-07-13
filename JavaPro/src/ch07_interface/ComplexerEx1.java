package ch07_interface;
/*
 * �������̽� 
 * 1. �������̽��� ����� ���,�߻�޼���,default �޼���, static �޼��常 ����
 *    [public static final] �ڷ��� ���
 *    [public abstract] �ڷ��� �޼����();
 *    [public] default �ڷ��� �޼����() {} => jdk 8.0 ���Ŀ����� ����
 *    [public] static �ڷ��� �޼����() {}  => jdk 8.0 ���Ŀ����� ����
 * 2. �������̽��� ����� ���� �����ڴ� public
 * 3. ��üȭ �Ұ�. => ����Ŭ������ ��üȭ�� �ȴ�.
 * 4. Ŭ������ �������̽����� �������� ǥ���Ѵ�.
 *     => ���� ������ ������.
 * 5. �������̽����� ����� ���� ����� �����ϴ�.        
 */
interface Printerable{
	int INK = 100;
	void print();
}
interface Scannerable{ void scan();}
interface Faxable{
	String FAX_NO ="010-12345";
	void send(String tel);
	void receive(String tel);
}

interface Complexerable extends Printerable, Scannerable, Faxable{
	
}
class Complexer implements Complexerable{
	int ink;
	Complexer(){ink=INK;}
	@Override
	public void print() {
		System.out.println("���̿� ����մϴ�. ���� ��ũ��:" + --ink);
	}

	@Override
	public void scan() {
		System.out.println("�̹����� ��ĵ�մϴ�.");
	}

	@Override
	public void send(String tel) {
		System.out.println(FAX_NO + "���� " + tel + " ��ȣ�� FAX�� ����");
	}

	@Override
	public void receive(String tel) {
		System.out.println(tel + "���� " + FAX_NO + " �� FAX�� ����");
	}
}

public class ComplexerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complexer com = new Complexer();
		System.out.println("�⺻ ��ũ��: "+ Printerable.INK);
		System.out.println("Fax ��ȣ: " + Complexerable.FAX_NO);
	
		if(com instanceof Complexer) {
			System.out.println("com ���������� ��ü�� complexer �Դϴ�.");
			Complexer c = com;
		}
		System.out.println("===============Complexerable=================");
		if(com instanceof Complexerable) {
			System.out.println("com ���������� ��ü�� Complexerable �Դϴ�.");
			Complexerable c = com;
			c.print();
			c.scan();
			c.receive("02-5678");
			c.send("02-5678");
		}
		System.out.println("================Printerable================");
		if(com instanceof Printerable) {
			System.out.println("com ���������� ��ü�� Printerable �Դϴ�.");
			Printerable c = com;
			c.print();
		}
		System.out.println("================Scannerable================");
		if(com instanceof Scannerable) {
			System.out.println("com ���������� ��ü�� Scannerable �Դϴ�.");
			Scannerable c = com;
			c.scan();
		}
		System.out.println("================Faxable================");
		if(com instanceof Faxable) {
			System.out.println("com ���������� ��ü�� Faxable �Դϴ�.");
			Faxable c = com;
			c.receive("02-5678");
			c.send("02-5678");
		}

	}

}
