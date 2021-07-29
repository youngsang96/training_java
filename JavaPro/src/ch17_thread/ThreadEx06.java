package ch17_thread;

/*
 * 동기화 영역
 *   동기화 메서드 예제
 *   => 공유객체의 메서드여야 함. 
 *   => 공유객체 : 모든 스레드가 하나의 객체를 공유하고 있어야 한다. 
 */
class Printer{
	public synchronized void PrintChar(char ch) {
		for(int i =0; i<80; i++) {System.out.print(ch);
		}
		System.out.println();
		}
	}
class PrintThread2 extends Thread{
	Printer ptr; char ch;
	PrintThread2(Printer ptr, char ch){
		this.ptr = ptr;
		this.ch = ch;
	}
	public void run() {
		for(int i= 0; i<20; i++) {
			ptr.PrintChar(ch);
		}
	}
}
public class ThreadEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer ptr = new Printer();
		Thread t1 = new PrintThread2(ptr,'A');
		Thread t2 = new PrintThread2(ptr,'B');
		Thread t3 = new PrintThread2(ptr,'C');
		t1.start();
		t2.start();
		t3.start();
	}

}
