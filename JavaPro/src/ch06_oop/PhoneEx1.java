package ch06_oop;
class Phone2{
	boolean power;
	int number;
	void power() {
		power =!power;
	}
	void send() {
		if(power) System.out.println("��ȭ�ɱ�");
	}
	void receive() {
		if(power) System.out.println("��ȭ�ޱ�");
	}
}
class SmartPhone extends Phone2{
	void setApp(String name) {
		if(power) System.out.println(name+" ��ġ��~");
	}
}
public class PhoneEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone sp=new SmartPhone();
		
		System.out.println(sp.toString());
		sp.power=true;
		sp.send();
		sp.receive();
		sp.setApp("naver");
	}

}
