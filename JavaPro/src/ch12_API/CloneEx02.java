package ch12_API;
import temp.Point;
//clone()�� protected�̱� ������ �޼ҵ带 ���� class ���ο��� ����Ͽ��� �Ѵ�

public class CloneEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point original = new Point(3, 5);
		Point copy =(Point) original.clone();
		System.out.println(original);
		System.out.println(copy);
	}

}
