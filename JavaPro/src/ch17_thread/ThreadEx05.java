package ch17_thread;
class PrintThread extends Thread{
	char ch;
	static int[] lock = new int[3];
	
	PrintThread(char ch){ this.ch=ch;}
	
	public void run() {
		for(int i=0; i<20; i++) {
			synchronized(lock) {   //µ¿±âÈ­
			for(int j=0; j<80; j++) {
			System.out.print(ch);
			}		
		System.out.println();
			}
		}
	}
}
public class ThreadEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new PrintThread('A');
		Thread t2 = new PrintThread('B');
		Thread t3 = new PrintThread('C');
		t1.start();
		t2.start();
		t3.start();
		
	}

}
