package ch12_API;

public class HashCodeEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value v1 = new Value("abc");
		Value v2 = new Value("abc");
		System.out.println(v1.equals(v2));
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		
		System.out.println(System.identityHashCode(v1));
		System.out.println(System.identityHashCode(v2));
	}

}

class Value{
	String value;
	Value(String value){
		this.value=value;
	}
	public boolean equals(Object obj) {
		if (obj instanceof Value) {
			Value v = (Value) obj;
			return value==v.value;
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		return value.hashCode();
	}
}
