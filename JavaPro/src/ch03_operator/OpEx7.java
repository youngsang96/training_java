package ch03_operator;
/*
 * 비트연산자 : &(and),|(or),^(XOR),~(not) : 정수값,
 */
/*
 *  6 : 0110
 *  3 : 0011
 *  --------
 *  &   0010  : 2
 */
/*
 *  6 : 0110
 *  3 : 0011
 *  --------
 *  | : 0111  : 7  
 */
/*  같으면 0, 다르면 1
 *  6 : 0110
 *  3 : 0011
 *  --------
 *  ^ : 0101  : 5  
 */
/* 
 * 10 : 00001010
 * ---------------
 * ~  : 11110101   : ?
 * 
 *
 */
public class OpEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("6 & 3=" + (6&3));
		
		System.out.println("6 | 3=" + (6|3));
		
		System.out.println("6 ^ 3=" + (6^3));
		
		System.out.println("~-10=" + ~10);
	}

}
