package ch16_stream;

import java.util.function.Function;

public class FunctionAndThenComposeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Member1, Address> functionA;
		Function<Address, String> functionB;
		Function<Member1, String> functionAB;
		String city;
		functionA = (m) -> m.getAddress();
		functionB = (a) -> a.getCity();
		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(
				new Member1("ȫ�浿","hong",new Address("�ѱ�","����")) );
		System.out.println("���� ����: "+city);
		
		System.out.println();
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(
				new Member1("ȫ�浿","hong",new Address("�ѱ�","����")) );
		System.out.println("���� ����: "+city);
		
	}

}
