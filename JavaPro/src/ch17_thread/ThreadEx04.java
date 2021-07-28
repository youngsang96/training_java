package ch17_thread;
/*
 * 데몬스레드
 *   데몬 스레드의 기능은 일반 스레드의 보조 역할을 담당한다.
 *   일반스레드가 종료되면 데몬 스레드도 종료된다.
 *   데몬 스레드는 무한반복으로 구현한다.
 *   설정 : setDaemon(true) => 반드시 new 상태에서 해야 한다.
 *                            Runnable 상태에서 설정하면 예외가 발생한다.
 */

class DaemonThread extends Thread {
	public void run() {
		while(true) {
			System.out.println(getName());
			try {
				sleep(100);
			}catch(InterruptedException e) {
				
			}
		}
	}
}
public class ThreadEx04 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t1 = new DaemonThread();
		Thread t2 = new DaemonThread();
		
		t1.setDaemon(true);
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		Thread.sleep(2000);
		System.out.println("main 스레드 종료");
	}

}
