package ch06_oop;
/*
 * 다형성 예제
 * Buyer가 전자제품 구매하기
 * 
 * Product 클래스
 *   멤버변수 : int 가격(price), int 포인트(point)
 *   생성자 : 가격을 입력받고, 가격의 10%를 포인트로 저장.
 * Tv 클래스 ( parent class:Product)
 *   생성자(int) :가격을 100 설정하기
 *   toString() 메서드에서 Tv를 리턴.   
 * Computer 클래스 ( parent class:Product)
 *   생성자(int) : 가격을 200 설정하기
 *   toString() 메서드에서 Computer를 리턴. 
 * SmartPhone 클래스     ( parent class:Product)
 *   생성자(int) : 가격을 150 설정하기
 *   toString() 메서드에서 SmartPhone를 리턴. 
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
 * Buyer 클래스 : 
 * 멤버변수 : int money = 500, 
 *          point Product[3] cart = new Product[3];
 *          int cnt; 
 * 멤버메서드 : buy(Product p) 
 *               p상품의 가격만큼 money 차감. 
 *               p상품의 포인트 만큼 point 증가. 
 *               화면에 구입한 제품 출력. 
 *               cart에 제품 추가. 
 *            summary()
 *               각 구매한 물품의 가격과 포인트 출력 
 *               전체 구매 물품 가격 출력
 *               전체 구매 물품 목록출력
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
			System.out.println("상품: " + p + "가격= "+p.price+" 포인트: "+ p.point);
			sum+=p.price;
			productList +=p+" ";
		}
		System.out.println();
		System.out.println("상품 구입 가격: "+sum);
		System.out.println("상품 목록: "+productList);
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
		
		System.out.println("구매후 잔액: " + b.money);
		System.out.println("적립 포인트: "+ b.point);
		System.out.println("======구매 제품 목록=======");
		b.summary();
	}

}

