package ch15_lamda;
interface LambdaInterface3 {	int method(int x, int y);}
public class LambdaEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaInterface3 f3 =(x,y)->{return x*y;};
		System.out.println("두수의 곱: "+f3.method(2,5) );
		
		f3 = (x,y)->x+y;
		System.out.println("두수의 합: "+f3.method(2,5) );
		
		f3 = (x,y)->x/y;
		System.out.println("두수의 몫: "+f3.method(5,2) );
		
		f3 = (x,y)->x%y;
		System.out.println("두수의 나머지: "+f3.method(5,2) );
		
		f3 = (x,y)-> sum(x,y);
		System.out.println("두수의 합: "+f3.method(2,5) );
		
		f3 = (x,y)->(x<y)?x:y;
		System.out.println("작은 수: "+f3.method(2,5) );
		
		f3 = (x,y)->(x>y)?x:y;
		System.out.println("큰 수: "+f3.method(2,5) );
		
		excute((x,y)->sum(x,y),33,11);
	}
static int sum(int x, int y) {
	return x+y;
}
static void excute(LambdaInterface3 f3, int x, int y) {
	System.out.println(f3.method(x,y));
}
}
