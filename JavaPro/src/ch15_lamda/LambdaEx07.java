package ch15_lamda;
import java.util.function.*;

public class LambdaEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Supplier<String> s1 = ()->{
			return "java";
		};	*/
		
		Supplier<String> s1 = ()->"java";
		System.out.println(s1.get());
	
		/*	IntSupplier s2 = ()->{
			int num = (int)(Math.random()*6)+1;
			return num;
		}; */
		
		IntSupplier s2 = ()-> (int)(Math.random()*6)+1;
		System.out.println("주사위: " + s2.getAsInt());
		DoubleSupplier s3 = ()->{
			double d = Math.random(); return d;
		};
		System.out.println("임의의 실수: "+ s3.getAsDouble());
	}

}
