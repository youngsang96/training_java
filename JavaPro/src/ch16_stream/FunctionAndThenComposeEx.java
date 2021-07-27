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
				new Member1("홍길동","hong",new Address("한국","서울")) );
		System.out.println("거주 도시: "+city);
		
		System.out.println();
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(
				new Member1("홍길동","hong",new Address("한국","서울")) );
		System.out.println("거주 도시: "+city);
		
	}

}
