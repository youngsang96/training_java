package ch17_thread;
class Runnable1 implements Runnable{
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(i +" = " + Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
			}
		}
}
}
public class ThreadEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main 스레드 시작");
		Runnable r = new Runnable1();
		Thread t1 = new Thread(r,"First");
		Thread t2 = new Thread(r,"Second");
		Thread t3 = new Thread(r);
		t1.start();
		t2.start();
		t3.start();
		System.out.println("main 스레드 종료");
	}

}
