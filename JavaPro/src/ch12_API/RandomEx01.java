package ch12_API;
import java.util.Random;
/*����(�����Ǽ�)�� �����ϴ� ����� ���� Ŭ������. 
* Math Ŭ������ random() �޼��带 ���ؼ� ������ ������ ���� double �ڷ����� ����������, 
* Random Ŭ������ �̿��ϸ�  boolean, int, long, float, double �� 
* �ڷ����� ���� �߻��� ���� �����ϴ�. 
* ���� ������ ����� �˰��� ���Ǵ� ����(seed)���� �����Ͽ� �پ��� ������ ������ �� �ִ�.*/
/*seed ���� ���� Random Ŭ������ ���� ������ �����Ѵ�*/

public class RandomEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random  rand = new Random();
		rand.setSeed(1);
		Random  rand2 = new Random();
		rand2.setSeed(System.currentTimeMillis());
		
		System.out.println("rand=>");
		for(int i=0; i<5; i++) {
			System.out.println(i + ":" + rand.nextInt(100));		
		}
		System.out.println();
		System.out.println("rand2=>");
		for(int i=0; i<5; i++) {
			System.out.println(i + ":" + rand2.nextInt(100));		
		}
	}

}
