package ch11_exception;
import java.io.IOException;
/*
 * �������̵� �� �޼����� ����ó���� �θ�޼����� 
 * ����ó���� ���ų� �ڼ�(child)  Exception�� �����ϴ�.
 * ���� ���þ��� ����ó���� �ȵȴ�.
 */

class Parent{
	void method(int i) throws Exception{
		System.out.println(i);
	}
}
class Child extends Parent{
	@Override
	void method(int i) throws IOException{
		System.out.println(i);
		try {
			throw new IOException();
		}catch(IOException e) {}
	}
}
public class ExceptionEx07 {}

