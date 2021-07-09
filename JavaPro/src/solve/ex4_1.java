package solve;
class Animal{
	String name;
	int age;
	
	Animal(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name + ": "+age;
	}
}

public class ex4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal("¿ø¼þÀÌ",26);
		System.out.println(a);

	}

}
