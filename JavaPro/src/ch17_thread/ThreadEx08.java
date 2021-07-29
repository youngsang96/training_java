package ch17_thread;
class SumThread extends Thread{
	int start, last, sum;
	
	SumThread(int s, int l){
		this.start=s;
		this.last=l;
	}
	public void run() {
		for(int i=start; i<=last; i++) {
			sum+=i;
			try {
				sleep(3);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.printf("%d에서 %d까지의 합: %d%n",start,last,sum);
	}
}
public class ThreadEx08 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SumThread t1 = new SumThread(1, 100);
		SumThread t2 = new SumThread(101, 200);
		SumThread t3 = new SumThread(201, 300);
		SumThread t4 = new SumThread(301, 400);
		SumThread t5 = new SumThread(401, 500);
		
		t1.start(); t2.start(); t3.start();
		t4.start(); t5.start();
		t1.join(); t2.join(); t3.join(); t4.join(); t5.join();
		
		System.out.println(t1.start+"부터 "+ t5.last+"까지의 합:" + 
		(t1.sum + t2.sum + t3.sum + t4.sum + t5.sum));
	}

}
