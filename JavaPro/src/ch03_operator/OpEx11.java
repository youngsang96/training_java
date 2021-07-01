package ch03_operator;

public class OpEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = 1000000 * 1000000;
		long b = 1000000 * 1000000L;
		
		System.out.println("a=" + a); // (int) type Overflow
		System.out.println("b="+b);
	}

}
