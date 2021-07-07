package ch06_oop;

class Sonata2{
	String color; //인스턴스변수
	int number; //인스턴스변수
	int serialNo;
	static int sno;
	static int width=250; //클래스변수
	static int height = 150; //클래스변수
	public String toString() {
		return "자동차고유번호: "+serialNo +", "+color +":"+ number + "("+width +","+height+" :자동차생산번호=" +sno +")";
	}
	}
public class VarEx2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자동차크기: "+ Sonata.width +","+Sonata.height);
		Sonata2 car1= new Sonata2();
		car1.color = "white"; car1.number=1234; car1.serialNo=++Sonata2.sno;
		Sonata2 car2= new Sonata2();
		car2.color = "black"; car2.number=5678; car2.serialNo=++Sonata2.sno;
		System.out.println("car2: "+ car2);
		System.out.println(car1);
		System.out.println(car2);
		Sonata2 car3= new Sonata2();
		car3.color = "red"; car3.number=1591; car3.serialNo=++Sonata2.sno;
		System.out.println(car3);
		System.out.println("=====================");
		Sonata2 car4 = car3;
		System.out.println(car4);
	}

}