package ch11_exception;
/*
 * ���� catch ���� ����
 * top -> down���� ó���Ǹ� 
 * ���� ������� Excepion�� ��������� 
 * ��� ������ Exception�� ������  �Ʒ��� �־���� 
 */

public class ExceptionEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//ArrayIndexOutOfBoundsException ���� �߻�
			//System.out.println(args[0]);
			//NumberformatException ���� �߻�
			//System.out.println(Integer.parseInt("a"));
			//System.out.println(10/Integer.parseInt("0"));
			String str = null;
			//System.out.println(str.charAt(0)); //NullPointerException
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("command ���ο� �Ķ���͸� �Է��ϼ���.");
		}catch(ArithmeticException e) {
			System.out.println("0���� ������ �����ϴ�.");
		}catch(NullPointerException e) {
			System.out.println("null �Դϴ�.");
		}catch(NumberFormatException e) {
			System.out.println("a�� ���ڷ� �Է��ϼ���");
		}catch(RuntimeException e) {
			System.out.println("1.�����߻� : ����η� ��ȭ���");
		}catch(Exception e) {
			System.out.println("2.�����߻� : ����η� ��ȭ���");
		}
	}

}
