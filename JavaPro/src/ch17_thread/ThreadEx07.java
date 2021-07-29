package ch17_thread;
class ATM implements Runnable{
	private int money = 1000000;

	@Override
	public void run() {
		// TODO Auto-generated method stub
	while(true) {
		try {
			Thread.sleep(1);
		}catch(InterruptedException e) {
		}
		if(money<=0)
		break;
		withdraw();
	
	}
	}
	synchronized void withdraw() {
		if(money<=0) return;
		money-=10000;
		System.out.println(Thread.currentThread()
			.getName()+" 10000¿ø Ãâ±Ý, ÀÜ¾×: "+ money);
	}
}
public class ThreadEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm = new ATM();
		Thread son = new Thread(atm,"¾Æµé");
		Thread daughter = new Thread(atm,"µþ");
		son.start(); daughter.start();
	}

}
