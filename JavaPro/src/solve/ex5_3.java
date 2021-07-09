package solve;
class Account{
	String account; int amount; int balance;
	Account(String account, int amount){
		this.account=account;
		this.amount=amount;
	}
	boolean transfer(Account a, int balance) {
		if(amount >= balance) {
			amount -= balance;
			a.amount+=balance;
			return true;
		}else
			System.out.println("�ܾ��� �����մϴ�.");
		return false;			
}
public String toString() {
	return "Account {num:"+ account+", balance :"+ amount+"}";
}
}
public class ex5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ü ����
	    Account a = new Account("123-45", 10000);
	    Account b = new Account("567-89", 10000);
	    
	    // �۱�: 3õ���� a ���¿��� -> b���·�!
	    boolean result = true;
	    while (result) {
	      result = a.transfer(b, 3000);
	    }
	    
	    // ��� ���
	    System.out.println(a.toString());  //num : balance print
	    System.out.println(b.toString());

	}

}
