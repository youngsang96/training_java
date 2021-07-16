package ch12_API;
import temp.Point;
class Circle implements Cloneable{
	Point p;
	double r;
	
	Circle(Point p, double r){
		this.p=p;
		this.r=r;
	}
	
	public Circle thinclone() {
		Object obj=null;
		try {
			obj=super.clone();
		}catch (CloneNotSupportedException e) {
		} return (Circle) obj;
	}
	
	public Circle deepclone() {
		Object obj=null;
		try {
			obj=super.clone();
			Circle c = (Circle) obj;
			c.p = new Point(this.p.x, this.p.y);
			return c;
		}catch (CloneNotSupportedException e) {
		} return (Circle) obj;
	}
	
	@Override
	public String toString() {
		return "Circle [p=" + p + ", r= "+r+"]";
	}
}
public class Clone04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(new Point(1,1),2.0);
		Circle c2 = c1.thinclone();
		Circle c3 = c1.deepclone();
		
		System.out.println("c1= "+c1);
		System.out.println("c2= "+c2);
		System.out.println("c3= "+c3);
		c1.p.x = 9;
		c1.p.y = 9;
		System.out.println("================c1 º¯°æ ÈÄ================");
		System.out.println("c1= "+c1);
		System.out.println("c2= "+c2);
		System.out.println("================deepclone()================");
		System.out.println("c3= "+c3);
	}

}
