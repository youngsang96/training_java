package ch07_interface;
class LazerZet implements Printerable{
	@Override
	public void print() {
		System.out.println("������ Printer���� �����");
	}
}
class InkZet implements Printerable{
	@Override
	public void print() {
		System.out.println("��ũ�� Printer���� �����");
	}
}
class PrinterManager{
	//rinterable = Printerable �������̽��� ������ü�� ����
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
