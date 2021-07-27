package ch16_stream;
import java.util.function.*;

/* Consumer default 메소드 andThen()
 * 함수적 인터페이스가 가지고 있는 디폴트 메소드
 * 두 개의 함수적 인터페이스를 순차적으로 연결해 실행

 * */

public class ConsumerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Member1> consumerA = (m) -> {
			System.out.println("consumerA: " + m.getName()); };
			consumerA.accept(new Member1("홍길동","hong",null));
		Consumer<Member1> consumerB = (m) -> {
			System.out.println("consumerB: " + m.getId()); };
			consumerA.accept(new Member1("홍길동","hong",null));
			System.out.println("============================");
			
		Consumer<Member1> consumerAB = consumerA
				.andThen(consumerB)
				.andThen(consumerB)
				.andThen(consumerB)
				.andThen(consumerB);
		consumerAB.accept(new Member1("홍길동","hong",null));
		}
	}

interface MyConsumer<T>{
	void accept(T t);
	default MyConsumer<T> andThen(MyConsumer<T> after){
		return (T t) -> { accept(t); after.accept(t);};
	}
}


