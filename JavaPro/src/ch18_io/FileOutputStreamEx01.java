package ch18_io;
import java.io.*;

/*
 * FileOutputStream ����
 *   : ���Ͽ� ������ ���
 *   void write(int data) : data �� 1����Ʈ�� ���Ϸ� ���
 *   void write(byte[] buf) : buf�� ������ ���Ϸ� ��� 
 *   void write(byte[] buf,int start, int len) : buf�� start �ε��� ���� 
 *        len����Ʈ ��ŭ ������ ���Ϸ� ��� 
 */

public class FileOutputStreamEx01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("out.txt");
		fos.write('1'); fos.write('2'); fos.write('3');
		fos.write('a'); fos.write('b'); fos.write('c');
		fos.write('��'); fos.write('��'); fos.write('��');
		
		byte[] buf = "\n�ݰ����ϴ�. FileOutputStream �����Դϴ�.\n".getBytes();
		fos.write(buf);
		fos.write(buf,1,5);
		fos.flush();
	}

}
