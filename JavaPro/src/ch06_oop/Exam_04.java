package ch06_oop;
/*
 * 모든 식품(Food)은 가격(price)과 포인트(point)를 멤버로 가진다.
 * 식품의 객체 생성시 가격을 입력받아야 하고, 가격의 10%를 포인트로 저장한다.
 * 
 * 식료품의 종류는 과일(Fruit),음료(Drink),과자(Snack)로 나눠 진다.
 * 
 * 과일 클래스는 당도(brix)를, 음료는 용량(ml), 과자는 무게(gram)을 멤버로 가진다
 * 과일의 종류로는 사과(Apple),복숭아(Peach), 
 * 음료의 종류로는 콜라(Coke) 와 사이다(Sidar)
 * 과자의 종류로는 비스킷(Biscuit)과 쿠키(Cookie) 가 있다.
 * 사과,복숭아, 콜라, 사이다,비스킷,쿠키 클래스에 toString() 메서드를 구현하고
 * 각각의 이름을 리턴한다.
 * 
 * 사과와 복숭아 생성시 가격과 당도를 , 
 * 콜라,사이다 생성시 가격과 용량을
 * 비스킷과 쿠키 생성시 가격과 무게를 입력받아 객체를 생성한다.  
 * Food, Fruit, Drink,Snack,Apple,Peach,Cock,Sidar, Biscuit,Cookie 클래스
 * 10개를 구현하기 
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
		System.out.println(f +": 가격= "+f.price +"구입");
		cart[cnt++]=f;
		}else System.out.println(f+" 구매시 잔액부족");
	}
	void summary2() {
		int sum=0;
		int fprice=0, dprice=0, sprice=0;
		String fList="", dList="", sList="";
		int fruit=0, snack=0, drink=0;
		System.out.println("총 구매금액: "+ (point*10)+"원, 총 구매건수: "+ cnt);
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
		System.out.println("과일구매금액: " +fprice+", 과일구매개수: " +fruit+", 과일구매목록: "+fList);
		System.out.println("음료구매금액: " +dprice+", 음료구매금액: " +drink+", 음료구매금액: "+dList);
		System.out.println("과자구매목록: " +sprice+", 과자구매목록: " +snack+", 과자구매목록: "+sList);
	}
}
public class Exam_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple apple = new Apple(1000, 10.5);
		System.out.println("사과 가격: " + apple.price);
		System.out.println("사과 당도: "+apple.brix);
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
		System.out.println("고객 잔액: " + b.money);
		System.out.println("고객 포인트: "+ b.point);
		System.out.println("============================");
		b.summary2();
	}

}
