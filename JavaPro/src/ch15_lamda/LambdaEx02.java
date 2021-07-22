package ch15_lamda;

/* 매개변수 존재, 리턴값이 없는 경우
 * 매개변수가 한개인 경우 () 생략 가능
 * 실행되는 구문이 한개인 경우 {} 생략 가능
 */

@FunctionalInterface
interface LambdaInterface2 { void method(int x);}
public class LambdaEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaInterface2 f2;
		f2 = (x)->{System.out.println(x*5);};
		f2.method(2);
		f2.method(10);
		f2 = (x)->{System.out.println(x+x);};
		f2.method(10);
		f2 = x->System.out.println(x*3);
		f2.method(2);
		f2.method(10);
		excute(x->System.out.println(x*3),11);
		}
	
	static void excute(LambdaInterface2 f2, int x) {
		f2.method(x);
	}

}
