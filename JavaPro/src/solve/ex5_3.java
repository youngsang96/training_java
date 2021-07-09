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
			System.out.println("잔액이 부족합니다.");
		return false;			
}
public String toString() {
	return "Account {num:"+ account+", balance :"+ amount+"}";
}
}
public class ex5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성
	    Account a = new Account("123-45", 10000);
	    Account b = new Account("567-89", 10000);
	    
	    // 송금: 3천원씩 a 계좌에서 -> b계좌로!
	    boolean result = true;
	    while (result) {
	      result = a.transfer(b, 3000);
	    }
	    
	    // 결과 출력
	    System.out.println(a.toString());  //num : balance print
	    System.out.println(b.toString());

	}

}
