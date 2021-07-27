package ch16_stream;
import java.util.function.*;

/* Consumer default �޼ҵ� andThen()
 * �Լ��� �������̽��� ������ �ִ� ����Ʈ �޼ҵ�
 * �� ���� �Լ��� �������̽��� ���������� ������ ����

 * */

public class ConsumerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Member1> consumerA = (m) -> {
			System.out.println("consumerA: " + m.getName()); };
			consumerA.accept(new Member1("ȫ�浿","hong",null));
		Consumer<Member1> consumerB = (m) -> {
			System.out.println("consumerB: " + m.getId()); };
			consumerA.accept(new Member1("ȫ�浿","hong",null));
			System.out.println("============================");
			
		Consumer<Member1> consumerAB = consumerA
				.andThen(consumerB)
				.andThen(consumerB)
				.andThen(consumerB)
				.andThen(consumerB);
		consumerAB.accept(new Member1("ȫ�浿","hong",null));
		}
	}

interface MyConsumer<T>{
	void accept(T t);
	default MyConsumer<T> andThen(MyConsumer<T> after){
		return (T t) -> { accept(t); after.accept(t);};
	}
}


