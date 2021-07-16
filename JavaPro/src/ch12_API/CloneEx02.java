package ch12_API;
import temp.Point;
//clone()은 protected이기 때문에 메소드를 만들어서 class 내부에서 사용하여야 한다

public class CloneEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point original = new Point(3, 5);
		Point copy =(Point) original.clone();
		System.out.println(original);
		System.out.println(copy);
	}

}
