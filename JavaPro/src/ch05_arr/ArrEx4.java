package ch05_arr;
/*
 * command ���ο��� �Ķ���� �ޱ�
 * javac ArrayEx6.java 
 *  c:\aaa\> java  ArrayEx6 ȫ�浿 ��� 
 */
public class ArrEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args.length);
		if(args.length==0) {
			System.out.println("Ŀ�����ο� �Ķ���͸� �Է��ϼ���");
			System.out.println("java ch6.ArrEx4 ȫ�浿 ���");
			return;
		}
		for(int i=0; i<args.length; i++) {
			System.out.println("args["+i+"]="+args[i]);
		}
	}
}
