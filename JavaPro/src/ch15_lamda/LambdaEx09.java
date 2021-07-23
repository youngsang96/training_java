package ch15_lamda;
import java.util.*;
import java.util.function.*;
/*
 * Operator 인터페이스 예제 : apply 계열 추상 메서드 소유
 *   매개변수 있고, 리턴값도 존재. =>
 *    단 매개변수의 자료형과 리턴값의 자료형이 같다.
 *   Function 인터페이스의 하위 인터페이스임.
 *   result = op.applyAsInt(result, next);
 */

public class LambdaEx09 {
	private static Student[] list = {
			new Student("홍길동",90,80,"경영"),
			new Student("김삿갓",95,70,"컴공"),
			new Student("이몽룡",100,70,"수학")};
	public static void main(String[] args) {
		List li = Arrays.asList(list);
		System.out.print("최대 수학 값: ");
		int max = maxOrMinMath((a,b)->(a>=b)?a:b);
		//max = maxOrMinMath((a,b)->{if (a>=b)return a; else return b;});
		System.out.println(max);
		System.out.print("최대 평균 값: ");
		System.out.println(maxOrMinAvg((a,b)->(a>=b)?a:b));
		System.out.print("최소 평균 값: ");
		System.out.println(maxOrMinAvg((a,b)->(a<=b)?a:b));
		
	}
	static int maxOrMinMath(IntBinaryOperator op) {
		int result = list[0].getMath();
		for(Student s : list) {
			result = op.applyAsInt(result,s.getMath());
		}
		return result;
	}
	static double maxOrMinAvg(DoubleBinaryOperator op) {
		double result = ((list[0].getMath() + list[0].getEng())/2);
		for(Student s : list) {
			//System.out.println((s.getMath()+s.getEng())/2);
			result = op.applyAsDouble(result,(s.getMath()+s.getEng())/2);
		}
		return result;
	}
}