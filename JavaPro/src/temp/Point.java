package temp;

public class Point implements Cloneable{
	public int x,y;
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