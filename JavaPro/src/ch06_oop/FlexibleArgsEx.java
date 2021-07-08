package ch06_oop;
/*
 * �����μ� : ����� �������� ���� �Ķ����
String... args
���� �Ŀ��� �迭�� ó�� �Ͽ� ����Ѵ� 
�Էµ� ���� �迭�� length�� �ȴ� 

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
