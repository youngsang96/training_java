package ch06_oop;
/*
 * ������ ����
 * Buyer�� ������ǰ �����ϱ�
 * 
 * Product Ŭ����
 *   ������� : int ����(price), int ����Ʈ(point)
 *   ������ : ������ �Է¹ް�, ������ 10%�� ����Ʈ�� ����.
 * Tv Ŭ���� ( parent class:Product)
 *   ������(int) :������ 100 �����ϱ�
 *   toString() �޼��忡�� Tv�� ����.   
 * Computer Ŭ���� ( parent class:Product)
 *   ������(int) : ������ 200 �����ϱ�
 *   toString() �޼��忡�� Computer�� ����. 
 * SmartPhone Ŭ����     ( parent class:Product)
 *   ������(int) : ������ 150 �����ϱ�
 *   toString() �޼��忡�� SmartPhone�� ����. 
 */

class Product{
	int price; int point;
	
	Product(int price){

		this.price= price;
		this.point =price/10; 
	}
}
class Tv extends Product{
	Tv(){
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}
	
class Computer extends Product{
	Computer(){
		super(200);
		}
		
	public String toString() {
		return "Computer";
	}
}
class SmartPhone2 extends Product{
	SmartPhone2(){
		super(150);
	}
		
	public String toString() {
		return "SmartPhone";
	}
}
/*
 * Buyer Ŭ���� : 
 * ������� : int money = 500, 
 *          point Product[3] cart = new Product[3];
 *          int cnt; 
 * ����޼��� : buy(Product p) 
 *               p��ǰ�� ���ݸ�ŭ money ����. 
 *               p��ǰ�� ����Ʈ ��ŭ point ����. 
 *               ȭ�鿡 ������ ��ǰ ���. 
 *               cart�� ��ǰ �߰�. 
 *            summary()
 *               �� ������ ��ǰ�� ���ݰ� ����Ʈ ��� 
 *               ��ü ���� ��ǰ ���� ���
 *               ��ü ���� ��ǰ ������
 */

class Buyer{
	int money = 500;
	int point;
	Product[] cart=new Product[3];
	int cnt;
	
	void buy(Product p){
		money=money - p.price;
		point += p.point;
		System.out.println(p);
		cart[cnt++]=p;
	}
	void summary() {
		int sum=0;
		String productList="";
		for(Product p : cart) {
			if(p == null) break;
			System.out.println("��ǰ: " + p + "����= "+p.price+" ����Ʈ: "+ p.point);
			sum+=p.price;
			productList +=p+" ";
		}
		System.out.println();
		System.out.println("��ǰ ���� ����: "+sum);
		System.out.println("��ǰ ���: "+productList);
	}
}

public class Exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		Tv tv = new Tv(); //Tv(100)
		Computer com = new Computer(); //Computer(200)
		SmartPhone2 sp = new SmartPhone2(); //SmartPhone2(150)
		b.buy(tv);
		b.buy(sp);
		b.buy(com);
		
		System.out.println("������ �ܾ�: " + b.money);
		System.out.println("���� ����Ʈ: "+ b.point);
		System.out.println("======���� ��ǰ ���=======");
		b.summary();
	}

}

