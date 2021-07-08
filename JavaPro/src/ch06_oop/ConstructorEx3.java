package ch06_oop;
/*
 * this 예약어 예제
 * this() 생성자 : 같은 클래스의 다른 생성자 호출시 사용됨.
 *               this 생성자 사용시 반드시 첫줄에서 호출되어야 함.
 * this 참조변수 : 자기 참조 변수. 자기 참조값을 저장 변수
 *              인스턴스 멤버를 참조할때 사용됨.
 *          
 *              지역변수와 멤버변수의 구분시 사용됨.
 */

class Car3{
	String color;
	String gearType;
	int door;
	
	Car3(){
		this("white", "auto", 4);
	}
	Car3(String color){
		this(color, "auto",4);
	}
	Car3(String color, String gearType, int door){
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
	@Override
	public String toString() {
		return "Car3 [color=" + color +", gearType=" + gearType + ", door=" + door +"]";
	}
}
public class ConstructorEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 c1 = new Car3();
		Car3 c2 = new Car3("blue");
		System.out.println("c1: "+c1);
		System.out.println("c2: "+ c2);
	}

}
