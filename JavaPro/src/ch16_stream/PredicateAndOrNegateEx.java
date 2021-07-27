package ch16_stream;

import java.util.function.IntPredicate;

/*
 * and(), or(), negate() ����Ʈ �޼ҵ�
Predicate �Լ��� �������̽��� ����Ʈ �޼ҵ�
and() - &&�� ���� 
�� Predicate�� ��� true�� ����  ���������� true ����
or() - || �� ���� 
�� Predicate �� �ϳ��� true�� ����  ���������� true ����
negate() - ! �� ���� 
Predicate�� ����� true�̸� false, false�̸� true ���� 
*/

public class PredicateAndOrNegateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntPredicate predicateA = a->a%2==0;
		IntPredicate predicateB = (a)->a%2==0;
		IntPredicate predicateAB;
		boolean result;
		
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9�� 2�� 3�� ����Դϱ�? " + result);
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9�� 2�Ǵ� 3�� ����Դϱ�? " + result);
		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println("9�� Ȧ���Դϱ�? " + result);
	}

}
