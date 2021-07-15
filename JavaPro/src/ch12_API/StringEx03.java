package ch12_API;

public class StringEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HTML-CSS-JavaScript-Java-JSP-½ºÇÁ¸µ";
		String[] subject = s.split("-");
		for(int i=0; i<subject.length; i++ ) {
			System.out.println((i+1)+" : "+ subject[i]);
		}
		s = "È«±æµ¿,±è»ñ°«,ÀÌ¸ù·æ,¼ºÃáÇâ,ÀÓ²©Á¤";
		String[] names = s.split(",");
		for(String n : names) {
			System.out.println(n);
	}
		System.out.println("ÀüÃ¼ÀÌ¸§: "+ names.length+ "¸í");
		
		int i = Integer.parseInt("100");
		System.out.println(i+1);
		double d = Double.parseDouble("100.5");
		System.out.println(d+0.1);
		System.out.println(++d);
		
	}
}
