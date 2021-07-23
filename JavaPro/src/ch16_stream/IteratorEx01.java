package ch16_stream;
import java.util.*;
import java.util.stream.Stream;

public class IteratorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list= Arrays.asList("홍길동","김삿갓","이몽룡","성춘향","임꺽정","향단이");
		System.out.println("=====외부 반복자 이용=====");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		System.out.println("=====내부 반복자 이용=====");
		Stream<String> st= list.stream();
		st.forEach(s->System.out.println(s));
		System.out.println();
		System.out.println("=====다시 출력=====");
		list.stream().forEach(s->System.out.println(s));
	}

}
