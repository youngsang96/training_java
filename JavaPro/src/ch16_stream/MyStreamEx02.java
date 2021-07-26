package ch16_stream;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class MyStream<T> {
	private T[] ts;
	private int tlength;
	private T t;
	private Consumer cc;
	MyStream(List<T> list) {
		this.ts = (T[]) list.toArray();
		tlength = list.size();
	}
	
	MyStream<T> filter(Predicate<T> pr) {
		List<T> li = new ArrayList<T>();
		for (int i = 0; i < ts.length; i++) {
			if (pr.test(ts[i])) {
				li.add(ts[i]);
			}
		}
		this.ts = (T[]) li.toArray();
		return this;
	}
	
	<U> MyStream<U> map(Function<T, U> f) {
		List<U> nl = new ArrayList<U>();
		MyStream<U> mystream = new MyStream<U>(nl);
		for (int i = 0; i < ts.length; i++) {
			nl.add(f.apply(ts[i]));
		}
		mystream.ts=(U[]) nl.toArray();
		return mystream;
	}
	
	Optional<T> reduce(BinaryOperator<T> bo) {
		if (cc!=null) peek(this.cc);
		T result = ts[0];
		for (int i = 0; i < ts.length; i++) {
			result = bo.apply(result, ts[i]);
		}
    return Optional.ofNullable(result);
	}
	
	MyStream<T> peek(Consumer<T> c) {
		for (int i = 0; i < ts.length; i++) {
			if(cc != null ) c.accept(ts[i]);
		}
		this.cc=c;
		return this;
	}
	
	void forEach(Consumer<T> c) {
		if (cc!=null) peek(this.cc);
		for (int i = 0; i < ts.length; i++) {
			c.accept(ts[i]);
		}
	}
	
	@Override
	public String toString() {
		return "MyStream [ts=" + Arrays.toString(ts) + ", tlength=" + tlength + "]";
	}
}

public class MyStreamEx02 {
	private static List<Student> list = 
			Arrays.asList(
				new Student("ȫ�浿", 55, 60, "�İ�"),
				new Student("�̸���", 95, 90, "�濵"), 
				new Student("���", 75, 80, "�ɸ�"), 
				new Student("�Ӳ���", 65, 70, "����"),
				new Student("������", 65, 0, "�İ�"));
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStream<Student> st1 = new MyStream<Student>(list);
		
		st1
		.filter(s->s.getEng() >= 60)
		.map((s)-> s.getName())
		.forEach(s -> System.out.println(s));
		System.out.println("=====================myStream");
		
		MyStream<Student> st2 = new MyStream<Student>(list);
		int tot = 
		st2
		.filter(s->s.getEng() >= 60)
		.map((s)-> s.getEng())
		.peek(s -> System.out.println(s))
		.reduce((a,b)->a+b)
		.get();
		System.out.println(tot);
	}

}