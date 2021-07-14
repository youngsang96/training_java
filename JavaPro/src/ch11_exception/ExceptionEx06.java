package ch11_exception;

import java.util.Scanner;

public class ExceptionEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String id="yohesa";
			String pw="159951";
			Scanner scan = new Scanner(System.in);
			System.out.print("id를 입력하세요: ");
			String inputId= scan.nextLine();
			System.out.print("pw를 입력하세요: ");
			String inputPw= scan.nextLine();
			if(id.equals(inputId) && pw.equals(inputPw)) {
				System.out.println("log in success");
			}else if(!id.equals(inputId)) {
				throw new LoginFailException("아이디가 틀렸습니다. 다시 로그인 하세요.");
			}else {
				throw new LoginFailException("비밀번호가 틀렸습니다. 다시 로그인 하세요.");
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
