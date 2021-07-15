package ch12_API;
/*

Object clone()�� protected�̱� ������ 
clone() �޼ҵ带 ���� class���ο��� ��� �Ͽ����Ѵ� 
clone()�� �ݵ�� ����ó���� ���־�� �Ѵ�.*/
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
