package ch18_io;
import java.io.*;

/*
 * ObjectOutputStream ����
 * - ��ü�� �ܺη� �����ϴ� ��Ʈ��.
 * - ���۵Ǵ� ��ü�� �ݵ�� Serializable �������̽��� �����ؾ� �Ѵ�.
 *    java.io.NotSerializableException : ����ȭ ��� ��ü�� �ƴ� 
 * - ��ü�� �ܺη� �����ϴ� ����� ����ȭ�� �Ѵ�.
 * - ObjectInputStream �� �̿��Ͽ� ��ü�� ���� �� �ִ�.
 */
//transient : age �������� ����ȭ ��󿡼� ���ܽ�Ŵ

class Customer implements Serializable{
	private String name;
	private int age;
	
	Customer(String name){
		this.name=name;
	}
	public Customer(String name, int age) {
		this.name=name; this.age=age;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
	
}
public class ObjectOutputStreamEx01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("object.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Customer c1 = new Customer("�P�浿",20);
		Customer c2 = new Customer("���",30);
		oos.writeObject(c1);
		oos.writeObject(c2);
		System.out.println("��1 : " + c1);
		System.out.println("��2 : " + c2);
	}

}
