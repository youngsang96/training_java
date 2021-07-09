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

public class Exam_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

