package ch06_oop;

public class MemberCallEx2 {
	static int cv1 = 10;
	static int cv2 = cv1; //클래스 멤버가 호출
	int iv1=100;
	int iv2=iv1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberCallEx2 m=new MemberCallEx2();
		cv2=m.iv1;
		m.method1();
		method2();
		
	}
	void method1() {
		System.out.println(cv1 + cv2);
		System.out.println(iv1 + iv2);
		}
	static void method2() {
		//System.out.println(iv1 + iv2);
		MemberCallEx1 m =new MemberCallEx1();
		System.out.println(cv1 + cv2);
		System.out.println(m.iv1 + m.iv2);
}
}