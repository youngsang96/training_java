package ch12_API;

public class EqualEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		
		String s1= new String("abc");
		String s2= new String("abc");
		if(s1 == s2) {
			System.out.println("s1�� s2�� ���� ��ü��");
		}else {
			System.out.println("s1�� s2�� �ٸ� ��ü��");
		}
		if(s1.equals(s2)) {
			System.out.println("s1,s2�� ���� ������ ��ü��");
		}else {
			System.out.println("s1,s2�� �ٸ� ������ ��ü��");
		}
		System.out.println("e1.hashCode()= "+e1.hashCode());
		System.out.println("e2.hashCode()= "+e2.hashCode());
		System.out.println("s1.hashCode()= "+s1.hashCode());
		System.out.println("s2.hashCode()= "+s2.hashCode());
	}

}
