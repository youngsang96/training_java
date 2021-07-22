package ch15_lamda;
/*
 * ���ٽ� ���� : jdk8.0 ���� �������� ��밡��.
 * ���ٽĿ��� ����� �� �ִ� �������̽��� �ݵ�� FunctionalInterface������
 * @FunctionInterface : �������̽����� �߻�޼��尡 �Ѱ���.
 * �Ű������� ����, ���ϰ��� ���� ���
 * �Ű����� ���� : ()->{.... }
 * ���ٽ� ���ο� ����Ǵ� ������ �Ѱ��� ��� { } ���� ����
 */

@FunctionalInterface
interface LambdaInterface1 { void method();}
public class LambdaEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaInterface1 fi = new LambdaInterface1() {
			@Override
			public void method() {
				System.out.println("1) ����������� �ڵ�");
			}
		};
		fi.method();
		fi = ()->{
			String str = "2) method call1";
			System.out.println(str);
		}; fi.method();
		fi = ()->{
			System.out.println("3) method call2");
		};
		fi.method();
		fi = ()->{
			System.out.println("4) method call3");
		};
		fi.method();
		fi = ()->{
			System.out.println("5) method call4");
		};
		fi.method();
		excute(()-> {System.out.println("6) LambdaInterface1 parameter");});
		excute(()-> System.out.println("7) LambdaInterface1 parameter"));
	}
	static void excute(LambdaInterface1 f1) {
		f1.method();
	}
}
