package ch14_collection;

public class Person implements Comparable<Person> {
	String name;
	int age;
	
	public int compareTo(Person o) {
		return (name.compareTo(o.name));
	}
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj;
		return (name.equals(p.name)) && (age == p.age);
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}
