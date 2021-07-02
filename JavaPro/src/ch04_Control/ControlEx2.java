package ch04_Control;

public class ControlEx2 {
	/*
	 * 반복문 예제
	 * for      
	 *     for(초기값;조건식;증감식) {   ... }
	 *     주로 시작과 종료가 지정된경우. 순차적 처리,
	 * while
	 *     while(조건식) { ... }
	 *     비순차적이지 않을때. 
	 *     exit 문자가 입력될때까지, 9문자가 입력될때까지. ...
	 * do while
	 *     do { ....  } while(조건식);
	 *     비순차적이지 않을때. 
	 *     조건에 상관없이 한번은 문장을 실행 할때.    
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1); System.out.println(2);
		System.out.println(3); System.out.println(4);
		System.out.println(5);
		System.out.println("for 구문으로 1~5 출력하기");
		for(int i=1; i<=5; i++) {System.out.println(i+" ");}
		System.out.println();
		System.out.println("while 구문으로 1~5출력하기");
		int i=1;
		while(i<=5) {System.out.println(i+" "); i++;} 
		
			System.out.println();
			System.out.println("do while문으로 1~5출력하기");
		i = 1;
		do{System.out.println(i+" "); i++;
		
		}while(i <=5);
	}
}
