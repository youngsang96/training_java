package ch17_thread;
/*
 * Thread�켱���� : 
 *    Runnable ���¿���  �����ٷ����� ���ù޾� Running ���·� ���� �ɶ� �켱���� ����.
 *    �켱������ ���ٰ� �ؼ� ������ ���� ������ �޴� ���� �ƴ�. Ȯ���� ����.
 *    �켱���� ���� �޼���  : setPriority(�켱����) */

class ThreadProperty extends Thread{
	
	ThreadProperty(String name, int p){
		super(name);
		setPriority(p);
	}
	public void run() {
		try { sleep(20);
		}catch(InterruptedException e) {}
		for(int i =0; i<50; i++) {
			System.out.println("***: "+this);
			/*
			 * Thread[Third,10,main]
			 * Third : �������̸�
			 * 10    : �켱����
			 * main  : ������ �׷�
			 */

		}
	}
	@Override
	public String toString() {
		return this.getName() + ", "+ this.getPriority();
	}
}
public class ThreadEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
		System.out.println("���� �켱 ���� : "+ Thread.MAX_PRIORITY);
		System.out.println("���� �켱 ���� : "+ Thread.MIN_PRIORITY);
		System.out.println("�⺻ �켱 ���� : "+ Thread.NORM_PRIORITY);
		
		Thread t1 = new ThreadProperty("First",5);
		Thread t2 = new ThreadProperty("Second",1);
		Thread t3 = new ThreadProperty("Third",10);
		t1.start();
		t2.start();
		t3.start();
	}

}
