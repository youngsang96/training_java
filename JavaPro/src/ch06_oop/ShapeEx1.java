package ch06_oop;
abstract class Shape{
	String type;
	Shape(String type){
		this.type=type;
	}
	abstract double area();
	abstract double length();
}
class Circle extends Shape{
	int r;
	Circle(int r){ super("원"); this.r=r;}
	@Override
	double area() {return Math.PI*r*r;}
	@Override
	double length() {return 2*Math.PI*r;}
	@Override
	public String toString() {
		return "Circle [r= "+r+", type= "+type+"], 넓이: "+area()+", 둘레: "+length();
	}
	}
class Rectangle3 extends Shape{
	int width, height;
	Rectangle3(int width, int height) {
		super("사각형"); this.width=width; this.height=height;}
	@Override
	double area() {return width*height;}
	@Override
	double length() {return 2*(width*height);}
	@Override
	public String toString() {
		return "Rectangle [width= "+width + ", height= "+height+", type= "+ type+ "], 넓이: "+ area()+", 둘레: "+ length();
	}
}
public class ShapeEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes=new Shape[2];
		shapes[0]= new Circle(10);
		shapes[1]= new Rectangle3(5,5);
		for(Shape s : shapes) {
			System.out.println(s);
		}
	}

}
