package ch18_io;
import java.io.*;
import java.util.Date;

public class FileOutputStreamEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstMethod();}
	public static void firstMethod() {
		secondMethod();
	}
	public static void secondMethod() {
	try {
		throw new Exception("���Ͽ� ���� �޼��� �����ϱ�");
	}catch(Exception e) {
		e.printStackTrace();
		try {
			
			/*
			 * ("error.log",true) 
			 *  "error.log" : ������ ������ �̸�. ���� ������ ����. 
			 *  				������ ������ ���� ����
			 *   true/false : true : ������ �ִ� ��� ������ ���뿡 
			 *   					  ���ο� ������ �߰�
			 *                false :������ �ִ� ��� ������ ������ 
			 *                       ���ο� �������� ���� 
			 */

			FileOutputStream fos = new FileOutputStream("error.log", true);
			fos.write(("1:" + e.getMessage()+"\n\n").getBytes());
			fos.write(("2:===================\n\n"+(new Date())+"\n\n").getBytes());
			e.printStackTrace(new PrintStream(fos));
			fos.write("3:===============\n\n".getBytes());
		}catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	}
}
