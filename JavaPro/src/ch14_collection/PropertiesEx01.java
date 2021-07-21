package ch14_collection;
import java.io.*;
import java.util.*;
/*
 * Properties Ŭ���� Hashtable ���̺��� ���� Ŭ������.
 * Hashtable�� Map �������̽��� ���� Ŭ�����̹Ƿ� Properties  
 * Ŭ������ Map�� ������ Ŭ������.
 * (key,value) �ڷ����� ��� String��. ���ظ�ǥ���� ���Ѵ�.
 * - �ؽ�Ʈ���Ͽ� Properties ��ü�� �߰��� �� �ִ� ����� �ִ�.
 */

public class PropertiesEx01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties pr = new Properties();
		System.out.println(pr);
		// File����putStream : a.properties������ ���� > �о�� �غ�
		FileInputStream fis = new FileInputStream("src/ch14_collection/a.properties");
		pr.load(fis);
		System.out.println(pr);
		
		//pr.get("name") : Key�� name�� ��ü�� Value�� ����
		System.out.println("�̸�: "+pr.getProperty("name"));
		// pr.getProperty : Hashtable�� ������ ���Ǵ� get �޼���
		System.out.println("��ȭ��ȣ:"+pr.getProperty("tel"));
		pr.put("subject", "��ǻ�Ͱ���");
		System.out.println(pr);
		// FileOutputStream : ���� �����ϱ�
		FileOutputStream fos = new FileOutputStream("src/ch14_collection/a.properties");
		
		pr.store(fos, "#save");
	}

}
