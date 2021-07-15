package ch12_API;
/*

Object clone()은 protected이기 때문에 
clone() 메소드를 만들어서 class내부에서 사용 하여야한다 
clone()은 반드시 예외처리를 해주어야 한다.*/
class Point implements Cloneable{
	int x,y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "Point [x ="+x+", y= "+y+"]";
	}
	@Override
	public Object clone() {
		try {
			return super.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return false;
	}
}
public class CloneEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point original = new Point(3, 5);
		Point copy =(Point) original.clone();
		System.out.println(original);
		System.out.println(copy);
	}

}
