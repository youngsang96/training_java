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

public class Exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

