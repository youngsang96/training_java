package ch17_thread;
/*
 * Thread 예제1
 * Thread 생성
 *   1. Thread 클래스 상속 =>ThreadEx1.java
 * 
 */

class thread1 extends Thread{
	thread1(String name){
		super(name);
	}
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(i +" = " + getName());
			try {
				sleep(1000);
			}catch(InterruptedException e) {
			}
		}
	}
}
public class ThreadEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main 스레드 시작");
		thread1 t1 = new thread1("First");
		thread1 t2 = new thread1("Second");
		/*
		 * start() 기능 
		 * 1. 스택영역을 병렬화 함. 
		 * 2. 자신의 스택 영역에 run()메서드 호출
		 */

		t1.start();
		t2.start();
		System.out.println("main 스레드 종료");
	}

}
