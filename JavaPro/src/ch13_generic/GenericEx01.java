package ch13_generic;
class MyClass01 {
	@Override
	public String toString() {
		return "MyClass01";
	}
}
class Pool01{
	private Object object;
	
	public void set(Object object) {
		this.object = object;
	}
	public Object get() {
		return object;
	}
}
public class GenericEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pool01 gen = new Pool01();
		gen.set("±×·£Á®"); //Object <--- String type
		String name = (String) gen.get();
		System.out.println(name);
		gen.set(new MyClass01());
		MyClass01 g = (MyClass01) gen.get();
		System.out.println("MyClass01 Type: "+g);
	}

}
