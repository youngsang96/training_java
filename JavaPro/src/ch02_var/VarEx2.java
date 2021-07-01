package ch02_var;
/*
 * 형변환 예제  
 *   큰자료형<=작은 자료형 : 자동형변환
 *   작은자료형 <= 큰자료형 : 명시적 형변환
 *   byte < short < int < long < float < double
 *          char
 *          
 *  A=B : 같다 의 의미가 아니고, 대입의 의미임.
 *        B의 값을 A에 입력함.
 *  lvalue : 대입연산자의 왼쪽의 값. 반드시 변수여야함.
 *  rvalue : 대입연산자의 오른쪽의 값, 변수, 리터널, 수식 가능             
 */

public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		String s = "a";
		byte b1 = (byte) 255;
		int i1 = b1;
		byte b2 = (byte) 11;
		System.out.println("b1=" + b1 + ", i1=" + i1);
		byte b3 = 100;
		System.out.println("b3=" + b3);
		long l1 = 10;
		float f1 = l1;
		long l2 = (long) f1;
		char c1 = 'A';
		short s1 = (short) c1;
		char c2 = (char) b1;
		
	}

}
