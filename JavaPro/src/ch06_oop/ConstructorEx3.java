package ch06_oop;
/*
 * this ����� ����
 * this() ������ : ���� Ŭ������ �ٸ� ������ ȣ��� ����.
 *               this ������ ���� �ݵ�� ù�ٿ��� ȣ��Ǿ�� ��.
 * this �������� : �ڱ� ���� ����. �ڱ� �������� ���� ����
 *              �ν��Ͻ� ����� �����Ҷ� ����.
 *          
 *              ���������� ��������� ���н� ����.
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
