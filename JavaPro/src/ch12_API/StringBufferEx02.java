package ch12_API;

public class StringBufferEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		System.out.println("sb == sb2 ? " + (sb == sb2));
		
		System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));
		
		String s = sb.toString();
		String s2 = sb2.toString();
		System.out.println("s.equals(s2) ? " + s.equals(s2));
	}

}
