package ch11_exception;

public class ExceptionEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3/0);
		}catch(Exception e) {
			System.out.println(4);
			return;
		}finally {
			System.out.println("finally: "+5);
		}
	System.out.println(6);
	}

}
