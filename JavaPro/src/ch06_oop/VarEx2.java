package ch06_oop;

class Sonata2{
	String color; //�ν��Ͻ�����
	int number; //�ν��Ͻ�����
	int serialNo;
	static int sno;
	static int width=250; //Ŭ��������
	static int height = 150; //Ŭ��������
	public String toString() {
		return "�ڵ���������ȣ: "+serialNo +", "+color +":"+ number + "("+width +","+height+" :�ڵ��������ȣ=" +sno +")";
	}
	}
public class VarEx2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�ڵ���ũ��: "+ Sonata.width +","+Sonata.height);
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