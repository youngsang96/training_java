package solve;
class Cube{
	int hor; int ver; int height;
	Cube(int x){
		this.hor=x;
		this.ver=x;
		this.height=x;
	}
	int volume() {
		return hor*ver*height;
	}
	int surfaceArea() {
		return 6*hor*ver;
	}
}
public class ex5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� ������ü ��ü ����
	    Cube a = new Cube(3);
	    Cube b = new Cube(5);
	    
	    // �� ������ü�� ���ǿ� �ѳ��� ���
	    System.out.printf("������ü a�� ����: %d, �ѳ���: %d\n", a.volume(), a.surfaceArea());
	    System.out.printf("������ü b�� ����: %d, �ѳ���: %d\n", b.volume(), b.surfaceArea());

	}

}
