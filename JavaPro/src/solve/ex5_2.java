package solve;
class Menu{
	String menu;
	int price = 0;
	Menu(String menu, int price){
		this.menu=menu;
		this.price=price;
}
	public String toString() {
		return menu+","+price;
	}
}
class Order{
	int sum; Menu[] arr;
	Order(int a, Menu[] arr) {
		this.arr = arr;
	}
	
	int totalPrice(){
		for(Menu arr:arr) {
			sum+=arr.price;
		}
	return sum;
	}
}
public class ex5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // �ֹ��� ���� �޴� ����
	    Menu jjajang = new Menu("¥��", 4900);
	    Menu jjambbong = new Menu("«��", 5900);
	    Menu tangsook = new Menu("������", 13900);
	    
	    // �޴��� �����Ͽ� �ֹ��� ����
	    Menu[] menuArr = { jjajang, jjambbong, tangsook };
	    // �޴��� �����Ͽ� �ֹ��� ����
	    Order order = new Order(123, menuArr);
	    // �ֹ� ��� ���
	    System.out.printf("�ֹ� �հ�: %d��\n", order.totalPrice());
	  }
	}
