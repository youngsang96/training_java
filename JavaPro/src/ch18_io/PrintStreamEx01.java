package ch18_io;
import java.io.*;

/*
 * ������Ʈ�� ���� : PrintStream
 *     - OutputStream�� ���� Ŭ����
 *     - print(), println(), printf() �޼��� �߰�
 *       ��� �ڷ����� ���. 
 *     - System.out(ǥ�� ��°�ü),System.err(ǥ�� ������ü)�� �ڷ�����.  
 */

public class PrintStreamEx01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("print.txt");
		PrintStream ps = new PrintStream(fos, false);
		
		
		ps.println("ȫ�浿"); ps.println(1234); ps.println(true);
		ps.write(65); ps.flush();
		
		ps = new PrintStream("print2.txt");
		ps.println("ȫ�浿"); ps.println(1234); ps.println(true);
	}

}
