package ch12_API;

public class StringEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HTML-CSS-JavaScript-Java-JSP-������";
		String[] subject = s.split("-");
		for(int i=0; i<subject.length; i++ ) {
			System.out.println((i+1)+" : "+ subject[i]);
		}
		s = "ȫ�浿,���,�̸���,������,�Ӳ���";
		String[] names = s.split(",");
		for(String n : names) {
			System.out.println(n);
	}
		System.out.println("��ü�̸�: "+ names.length+ "��");
		
		int i = Integer.parseInt("100");
		System.out.println(i+1);
		double d = Double.parseDouble("100.5");
		System.out.println(d+0.1);
		System.out.println(++d);
		
	}
}
