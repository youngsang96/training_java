package ch11_exception;
/*
 * throws ���� ó�� 
 * throws Exception�� ó���� �޼ҵ�� ���� �޼ҵ忡�� ó�� �Ͽ�����   
 * �� RuntimeException�� ó�� ���� �ʾƵ� ��
 */

public class ExceptionEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			first();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
private static void first() throws Exception{
	second();
}
private static void second() throws Exception{
	System.out.println("second �޼���");
	//NumberFormatException �߻�
	System.out.println("abc");
}
}
