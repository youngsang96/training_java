package ch15_lamda;
import java.util.*;
import java.util.function.*;
/*
 * Operator �������̽� ���� : apply �迭 �߻� �޼��� ����
 *   �Ű����� �ְ�, ���ϰ��� ����. =>
 *    �� �Ű������� �ڷ����� ���ϰ��� �ڷ����� ����.
 *   Function �������̽��� ���� �������̽���.
 *   result = op.applyAsInt(result, next);
 */

public class LambdaEx09 {
	private static Student[] list = {
			new Student("ȫ�浿",90,80,"�濵"),
			new Student("���",95,70,"�İ�"),
			new Student("�̸���",100,70,"����")};
	public static void main(String[] args) {
		List li = Arrays.asList(list);
		System.out.print("�ִ� ���� ��: ");
		int max = maxOrMinMath((a,b)->(a>=b)?a:b);
		//max = maxOrMinMath((a,b)->{if (a>=b)return a; else return b;});
		System.out.println(max);
		System.out.print("�ִ� ��� ��: ");
		System.out.println(maxOrMinAvg((a,b)->(a>=b)?a:b));
		System.out.print("�ּ� ��� ��: ");
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