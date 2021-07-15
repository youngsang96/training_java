package ch12_API;

public class StringEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABC";
		String str1 = "ABC";
		System.out.println("str hashCode(): "+ str.hashCode() + " ,"+ str1.hashCode());
		System.out.println("main: "+ str);
		str = change(str);
		System.out.println("str hashCode(): "+ str.hashCode() + " ,"+ str1.hashCode());
		System.out.println("change 이후 main: "+ str);
		change(str);
		System.out.println("change 이후 main-재설정 안함: "+ str);
		str="12345678";
		System.out.println(str.substring(3));
		str=str.substring(3);
		System.out.println(str);
	}

static String change(String str) {
	str +="456";
	System.out.println("chabge() s : "+ str);
	return str;
	}
}