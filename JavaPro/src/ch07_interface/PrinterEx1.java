package ch07_interface;
class LazerZet implements Printerable{
	@Override
	public void print() {
		System.out.println("레이저 Printer에서 출력함");
	}
}
class InkZet implements Printerable{
	@Override
	public void print() {
		System.out.println("잉크젯 Printer에서 출력함");
	}
}
class PrinterManager{
	//rinterable = Printerable 인터페이스의 구현객체를 리턴
	public static Printerable getPrinter(String type) {
		//Printerable p = new InkZet();
		if(type.equals("INK"))
			return new InkZet();
		else
			return new LazerZet();
	}
}
public class PrinterEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printerable able = PrinterManager.getPrinter("INK");
		able.print();
		able = PrinterManager.getPrinter("Lazer");
		able.print();
	}

}
