package ch11_exception;
/*
 * ����ó��
 * try ��: ���ܰ� �߻��� ���ɼ��� �ִ� �����.
 *          ���ܰ� �߻��� ��� ���� catch ������ �̵�.
 * catch�� : ���ܰ� �߻��ϸ� ȣ��Ǵ� ��
 *           ���ܰ� �߻��Ǹ�, ���ܴ� ���, ���������� ������ ��. 
 *           try ���� �Բ� ��� �ؾ���.         
 */

public class ExceptionEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(2);
			System.out.println(3);
			System.out.println(1/0);
			System.out.println(4);
		}catch(ArithmeticException e) {
			System.out.println("0���� ������ �����ϴ�.");
			System.out.println(5);
		}
	}

}
