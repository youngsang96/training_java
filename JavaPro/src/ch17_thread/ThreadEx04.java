package ch17_thread;
/*
 * ���󽺷���
 *   ���� �������� ����� �Ϲ� �������� ���� ������ ����Ѵ�.
 *   �Ϲݽ����尡 ����Ǹ� ���� �����嵵 ����ȴ�.
 *   ���� ������� ���ѹݺ����� �����Ѵ�.
 *   ���� : setDaemon(true) => �ݵ�� new ���¿��� �ؾ� �Ѵ�.
 *                            Runnable ���¿��� �����ϸ� ���ܰ� �߻��Ѵ�.
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
		System.out.println("main ������ ����");
	}

}
