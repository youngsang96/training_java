package ch18_io;
import java.io.*;

/*
 * FileInputStream : ���Ϸ� ���� �����͸� �б�
 *   int read() : 1byte�� �о ����. 
 *   int read(byte[] buf) : buf�� ũ�⸸ŭ �о �����͸� buf�� ����.
 *    ���� ���� ����Ʈ�� ����  
 *   int read(byte[] buf, int start, int len) :
 *                �����͸� len ����Ʈ ��ŭ �о buf�� start �ε��� ���� ����. 
 *                ���� ���� ����Ʈ�� ����  
 */

public class FileInputStreamEx01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("src/ch18_io/FileInputStreamEx01.java");
		System.out.println("*****read() �޼��� �̿��ϱ�*****");
		int data = 0;
		while ((data = fis.read()) != -1) {
			System.out.print((char)data);
		}
		
		fis = new FileInputStream("src/ch18_io/FileInputStreamEx01.java");
		System.out.println("*****read(byte[] buf) �޼��� �̿��ϱ�*****");
		byte[] buf = new byte[10];
		while ((data = fis.read(buf)) != -1) {
			System.out.print(new String(buf, 0 ,data));
		}
		
		fis = new FileInputStream("src/ch18_io/FileInputStreamEx01.java");
		System.out.println("*****read(byte[] buf) �޼��� �̿��ϱ�*****");
		buf = new byte[fis.available()];
		while ((data = fis.read(buf,0,buf.length)) != -1) {
			System.out.print(new String(buf, 0 ,data));
			System.out.println("------------end-------------");
			}
	}

}
