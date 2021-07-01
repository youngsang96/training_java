package ch02_var;

public class VarEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1 = 10;
		short s1 = 20;
		int i1 = 100;
		long l1 = 1000;
		i1 = b1;
		s1 = (short)l1;
		float f = l1;
		
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f);
	}

}
