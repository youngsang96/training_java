package ch12_API;
/*
 * Character Ŭ����
 */
public class WrapperEx3 {
	public static void main(String[] args) {
		char[] data = {'A','a','4','&'};
		for(char c : data) {
			if(Character.isUpperCase(c))
				System.out.println(c + ":�빮����");
			else if(Character.isLowerCase(c))
				System.out.println(c + ":�ҹ�����");
			else if(Character.isDigit(c))
				System.out.println(c + ":������");
			else System.out.println(c + ":�Ϲݹ�����");}
		Character ch = 'A'; //boxing
		System.out.println(ch.equals('A'));//true
		System.out.println(ch=='A');//true
		System.out.println(Character.isAlphabetic('A'));//true
		System.out.println(Character.isAlphabetic('a'));//true
		System.out.println(Character.isAlphabetic('��'));//true
		System.out.println(Character.isAlphabetic('1'));//false
	}}