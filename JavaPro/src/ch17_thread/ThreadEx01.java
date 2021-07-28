package ch17_thread;
/*
 * Thread ����1
 * Thread ����
 *   1. Thread Ŭ���� ��� =>ThreadEx1.java
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
		System.out.println("main ������ ����");
		thread1 t1 = new thread1("First");
		thread1 t2 = new thread1("Second");
		/*
		 * start() ��� 
		 * 1. ���ÿ����� ����ȭ ��. 
		 * 2. �ڽ��� ���� ������ run()�޼��� ȣ��
		 */

		t1.start();
		t2.start();
		System.out.println("main ������ ����");
	}

}
