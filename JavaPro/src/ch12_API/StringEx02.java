package ch12_API;
/*
 * String Ŭ������ �ֿ� �޼���
 */
public class StringEx02 {
	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		System.out.println(s.charAt(4)); //E, 5��° ���� ����
		//���İ��� �޼���. "ABCDEFGH" - "abc" : 65 - 97 = -32
		System.out.println(s.compareTo("abc"));//-32
		//IgnoreCase : ��ҹ��� ���о���.
		System.out.println(s.compareToIgnoreCase("abcdefgh"));//0
		//concat() : ���ڿ� ����. s = s + "abc"
		System.out.println(s.concat("abc"));//ABCDEFGHabc
		System.out.println(s + "abc");//ABCDEFGHabc
		//endsWith : s���ڿ��� ���� "GH"?
		System.out.println(s.endsWith("GH")); //true
		//startsWith : s���ڿ��� ������ "AB"?
		System.out.println(s.startsWith("AB")); //true
		System.out.println(s.equalsIgnoreCase("abcdefgh"));//true
		System.out.println(s.equals("abcdefgh"));//false
		s = new String("This is a String");
		//indexOf : ���ڳ� ���ڿ��� ��ġ ����
		System.out.println(s.indexOf('i')); //2
		//indexOf : 5���ε������� ���Ŀ� ���ڳ� ���ڿ��� ��ġ ����. 
		System.out.println(s.indexOf('i',5));//5
		//indexOf : 15���ε������� ���Ŀ� ���ڳ� ���ڿ��� ��ġ ����. 
		System.out.println(s.indexOf('i',15));//-1. 15�� �ε��� ���� ���ھ���.
		System.out.println(s.indexOf("is")); //2
		System.out.println(s.indexOf("is",3)); //5
		//lastIndexOf : ���ʺ��� �˻��Ͽ� ���ڳ� ���ڿ��� ��ġ ����
		System.out.println(s.lastIndexOf("is")); //5
		System.out.println(s.length()); //16. ���ڿ��� ����
		//replace : ġȯ  is=> QR���ڿ��� ġȯ.
		System.out.println(s.replace("is", "QR"));
		//substring : �κй��ڿ� ����
		// 5�� �ε��� ���� ���ĸ� �κй��ڿ��� ����
		System.out.println(s.substring(5));
		// 5�� �ε�������  13���ε��� �� ������ �κй��ڿ��� ���� (5 ~ 12 �ε���)
		System.out.println(s.substring(5,13));
		System.out.println(s.toLowerCase()); //�ҹ���
		System.out.println(s.toUpperCase()); //�빮��
		//trim() : ���� ���� ����. 
		System.out.println("["+"  ���ڿ� trim �޼���         ".trim()+"]");
	}}
