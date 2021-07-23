package ch16_stream;
import java.util.*;
import java.util.stream.Stream;

public class IteratorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list= Arrays.asList("ȫ�浿","���","�̸���","������","�Ӳ���","�����");
		System.out.println("=====�ܺ� �ݺ��� �̿�=====");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		System.out.println("=====���� �ݺ��� �̿�=====");
		Stream<String> st= list.stream();
		st.forEach(s->System.out.println(s));
		System.out.println();
		System.out.println("=====�ٽ� ���=====");
		list.stream().forEach(s->System.out.println(s));
	}

}
