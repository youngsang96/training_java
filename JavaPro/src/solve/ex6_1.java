package solve;
abstract class Figure{
	String type; double r; int x=0,y=0;
	int x1,y1;
	Figure(String type){
		this.type=type;
	}
	
	Figure(double r, int x, int y){
		this.r=r;
		this.x=x;
		this.y=y;
	}
	Figure(int x, int x1, int y, int y1){
		this.x=x;
		this.x1=x1;
		this.y=y;
		this.y1=y1;
	}
	abstract double area();
	abstract double length();
	public abstract String toString();
}

class Circle2 extends Figure{
	Circle2(String type){
		super(type);
	}
	
	Circle2(double r, int x, int y) {
		super(r, x, y);
	}
	
	@Override
	double area() {
		return Math.PI*r*r;
	}
	@Override
	double length() {
		return 2*Math.PI*r;
	}

	@Override
	public String toString() {
		return "Circle";
	}
}
class Rectangle4 extends Figure{

	Rectangle4(String type) {
		super(type);
	}
	
	Rectangle4(int x, int x1, int y, int y1){
		super(x,x1,y,y1);
	}
	
	@Override
	double area() {
		return (x1-x)*(y1-y);
	}

	@Override
	double length() {
		return ((x1-x)+(y1-y))*2;
	}
	
	@Override
	public String toString() {
		return "Rectangle";
	}
}
public class ex6_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figure[] fig = new Figure[2];
		fig[0]= new Circle2(5, 1, 1);
		fig[1]= new Rectangle4(1, 4, 3, 7);  //(1,3), (1,7) , (4,3), (4,7) 4점을 의미한다 
		
		for (Figure f : fig) {
			System.out.println(f+"--> 면적:" + f.area() + "   둘레:"+f.length());
		}
	}
}
