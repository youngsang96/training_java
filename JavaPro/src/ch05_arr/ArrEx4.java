package ch05_arr;
/*
 * command 라인에서 파라미터 받기
 * javac ArrayEx6.java 
 *  c:\aaa\> java  ArrayEx6 홍길동 김삿갓 
 */
public class ArrEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args.length);
		if(args.length==0) {
			System.out.println("커멘드라인에 파라미터를 입력하세요");
			System.out.println("java ch6.ArrEx4 홍길동 김삿갓");
			return;
		}
		for(int i=0; i<args.length; i++) {
			System.out.println("args["+i+"]="+args[i]);
		}
	}
}
