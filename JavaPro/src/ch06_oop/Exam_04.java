package ch06_oop;
/*
 * ��� ��ǰ(Food)�� ����(price)�� ����Ʈ(point)�� ����� ������.
 * ��ǰ�� ��ü ������ ������ �Է¹޾ƾ� �ϰ�, ������ 10%�� ����Ʈ�� �����Ѵ�.
 * 
 * �ķ�ǰ�� ������ ����(Fruit),����(Drink),����(Snack)�� ���� ����.
 * 
 * ���� Ŭ������ �絵(brix)��, ����� �뷮(ml), ���ڴ� ����(gram)�� ����� ������
 * ������ �����δ� ���(Apple),������(Peach), 
 * ������ �����δ� �ݶ�(Coke) �� ���̴�(Sidar)
 * ������ �����δ� ��Ŷ(Biscuit)�� ��Ű(Cookie) �� �ִ�.
 * ���,������, �ݶ�, ���̴�,��Ŷ,��Ű Ŭ������ toString() �޼��带 �����ϰ�
 * ������ �̸��� �����Ѵ�.
 * 
 * ����� ������ ������ ���ݰ� �絵�� , 
 * �ݶ�,���̴� ������ ���ݰ� �뷮��
 * ��Ŷ�� ��Ű ������ ���ݰ� ���Ը� �Է¹޾� ��ü�� �����Ѵ�.  
 * Food, Fruit, Drink,Snack,Apple,Peach,Cock,Sidar, Biscuit,Cookie Ŭ����
 * 10���� �����ϱ� 
 */

class Food{
int price; int point;
	
	Food(int price){

		this.price= price;
		this.point =price/10; 
	}
}
class Fruit extends Food{
	double brix;
	Fruit(int price, double brix) {
		super(price);
		this.brix=brix;
	}
	
}
class Drink extends Food{
	int ml;
	Drink(int price, int ml) {
		super(price);
		this.ml=ml;
	}
}
class Snack extends Food{
	int gram;
	Snack(int price, int gram) {
		super(price);
		this.gram=gram;
	}
}
class Apple extends Fruit{
	Apple(int price,double brix){
		super(price, brix);
	}
	public String toString() {
		return "Apple";
	}
}
class Peach extends Fruit{
	Peach(int price,double brix){
		super(price, brix);
	}
	public String toString() {
		return "Peach";
	}
}
class Coke extends Drink{
	Coke(int price,int ml){
		super(price, ml);
	}
	public String toString() {
		return "Coke";
	}
}
class Sidar extends Drink{
	Sidar(int price,int ml){
		super(price, ml);
	}
	public String toString() {
		return "Sidar";
	}
}
class Biscuit extends Snack{
	Biscuit(int price,int gram){
		super(price, gram);
	}
	public String toString() {
		return "Biscuit";
	}
}
class Cookie extends Snack{
	Cookie(int price,int gram){
		super(price, gram);
	}
	public String toString() {
		return "Cookie";
	}
}
class Buyer2{
	int money = 10000;
	int point;
	Food[] cart= new Food[20];
	int cnt; 
	
	void buy(Food f) {
		if(money >= f.price) {
		money=money - f.price;
		point += f.point;
		System.out.println(f +": ����= "+f.price +"����");
		cart[cnt++]=f;
		}else System.out.println(f+" ���Ž� �ܾ׺���");
	}
	void summary2() {
		int sum=0;
		int fprice=0, dprice=0, sprice=0;
		String fList="", dList="", sList="";
		int fruit=0, snack=0, drink=0;
		System.out.println("�� ���űݾ�: "+ (point*10)+"��, �� ���ŰǼ�: "+ cnt);
		for(Food f : cart) {
			if(f == null) break;
			
			if(f instanceof Fruit) {
				fprice+=f.price;
				fList+=f+" ";
				fruit++;
			}else if(f instanceof Drink){
				dprice+=f.price;
				dList+=f+" ";
				drink++;
			}else if(f instanceof Snack){
				sprice+=f.price;
				sList+=f+" ";
				snack++;
			}
		}
		System.out.println("���ϱ��űݾ�: " +fprice+", ���ϱ��Ű���: " +fruit+", ���ϱ��Ÿ��: "+fList);
		System.out.println("���ᱸ�űݾ�: " +dprice+", ���ᱸ�űݾ�: " +drink+", ���ᱸ�űݾ�: "+dList);
		System.out.println("���ڱ��Ÿ��: " +sprice+", ���ڱ��Ÿ��: " +snack+", ���ڱ��Ÿ��: "+sList);
	}
}
public class Exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple = new Apple(1000, 10.5);
		System.out.println("��� ����: " + apple.price);
		System.out.println("��� �絵: "+apple.brix);
		Peach peach= new Peach(1000, 13.5);
		Coke coke = new Coke(500,500);
		Sidar sidar = new Sidar(1500,1000);
		Biscuit bis = new Biscuit(10000,500);
		Cookie cookie = new Cookie(500,5000);
		System.out.println("============================");
		Buyer2 b = new Buyer2();
		b.buy(apple);
		b.buy(peach);
		b.buy(coke);
		b.buy(sidar);
		b.buy(bis);
		b.buy(cookie);
		System.out.println("============================");
		System.out.println("�� �ܾ�: " + b.money);
		System.out.println("�� ����Ʈ: "+ b.point);
		System.out.println("============================");
		b.summary2();
	}

}
