package ch06_oop;
/*
 * 가변인수 : 사이즈가 정해지지 않은 파라미터
String... args
받은 후에는 배열로 처리 하여 사용한다 
입력된 수가 배열의 length가 된다 

*/
public class FlexibleArgsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"A", "B", "C"};
		
		System.out.println(fParameter("-", str));
		System.out.println(fParameter(",", new String[] {"1", "2", "3"}));
		
	}
	static String fParameter(String delim, String ... args) {
		String result = "";
		
		for(int i =0; i < args.length; i++) {
			result += args[i]+delim;
		}
	return result;
	}
}
