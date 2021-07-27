package ch16_stream;

import java.util.function.BinaryOperator;

class Fruit {
	public String name;	public int price;
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;	}}

public class OperatorMinByMaxByEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		binaryOperator = BinaryOperator
				.minBy((f1,f2)-> Integer.compare(f1.price, f2.price));
		
		fruit = binaryOperator.apply(new Fruit("µþ±â", 6000), new Fruit("¼ö¹Ú", 10000));
		System.out.println(fruit.name);
		
		binaryOperator = BinaryOperator
				.maxBy((f1,f2)-> Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("µþ±â", 6000), new Fruit("¼ö¹Ú", 10000));
		System.out.println(fruit.name);
		
	}

}
