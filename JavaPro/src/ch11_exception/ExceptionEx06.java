package ch11_exception;

import java.util.Scanner;

public class ExceptionEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String id="yohesa";
			String pw="159951";
			Scanner scan = new Scanner(System.in);
			System.out.print("id�� �Է��ϼ���: ");
			String inputId= scan.nextLine();
			System.out.print("pw�� �Է��ϼ���: ");
			String inputPw= scan.nextLine();
			if(id.equals(inputId) && pw.equals(inputPw)) {
				System.out.println("log in success");
			}else if(!id.equals(inputId)) {
				throw new LoginFailException("���̵� Ʋ�Ƚ��ϴ�. �ٽ� �α��� �ϼ���.");
			}else {
				throw new LoginFailException("��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �α��� �ϼ���.");
			}
		}catch(LoginFailException e) {
			System.out.println("=========: "+ e.getMessage());
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
class LoginFailException extends Exception{
	String msg;
	LoginFailException(String msg){this.msg = msg;}
	@Override
	public String getMessage() {return msg;}
}
