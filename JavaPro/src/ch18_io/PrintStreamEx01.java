package ch18_io;
import java.io.*;

/*
 * 보조스트림 예제 : PrintStream
 *     - OutputStream의 하위 클래스
 *     - print(), println(), printf() 메서드 추가
 *       모든 자료형을 출력. 
 *     - System.out(표준 출력객체),System.err(표준 오류객체)의 자료형임.  
 */

public class PrintStreamEx01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps = new PrintStream(fos, false);
		
		
		ps.println("홍길동"); ps.println(1234); ps.println(true);
		ps.write(65); ps.flush();
		
		ps = new PrintStream("print2.txt");
		ps.println("홍길동"); ps.println(1234); ps.println(true);
	}

}
