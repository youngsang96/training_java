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
			System.out.println("e1과 e2는 같은 객체임");
		}else {
			System.out.println("e1과 e2는 다른 객체임");
		}
		if(e1.equals(e2)) {
			System.out.println("e1,e2는 같은 내용의 객체임");
		}else {
			System.out.println("e1,e2는 다른 내용의 객체임");
		}
	}

}
