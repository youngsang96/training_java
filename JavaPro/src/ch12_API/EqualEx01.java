package ch12_API;
class Equal{
	int value;
	Equal(int value){
		this.value= value;	}
	public boolean equals(Object obj) {
		if(obj instanceof Equal) {
			Equal e= (Equal)obj;
			return value==e.value;
		}else {
			return false;
		}
	}
}
public class EqualEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		if(e1 == e2) {
			System.out.println("e1�� e2�� ���� ��ü��");
		}else {
			System.out.println("e1�� e2�� �ٸ� ��ü��");
		}
		if(e1.equals(e2)) {
			System.out.println("e1,e2�� ���� ������ ��ü��");
		}else {
			System.out.println("e1,e2�� �ٸ� ������ ��ü��");
		}
	}

}
