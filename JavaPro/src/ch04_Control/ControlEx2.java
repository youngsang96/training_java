package ch04_Control;

public class ControlEx2 {
	/*
	 * �ݺ��� ����
	 * for      
	 *     for(�ʱⰪ;���ǽ�;������) {   ... }
	 *     �ַ� ���۰� ���ᰡ �����Ȱ��. ������ ó��,
	 * while
	 *     while(���ǽ�) { ... }
	 *     ����������� ������. 
	 *     exit ���ڰ� �Էµɶ�����, 9���ڰ� �Էµɶ�����. ...
	 * do while
	 *     do { ....  } while(���ǽ�);
	 *     ����������� ������. 
	 *     ���ǿ� ������� �ѹ��� ������ ���� �Ҷ�.    
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1); System.out.println(2);
		System.out.println(3); System.out.println(4);
		System.out.println(5);
		System.out.println("for �������� 1~5 ����ϱ�");
		for(int i=1; i<=5; i++) {System.out.println(i+" ");}
		System.out.println();
		System.out.println("while �������� 1~5����ϱ�");
		int i=1;
		while(i<=5) {System.out.println(i+" "); i++;} 
		
			System.out.println();
			System.out.println("do while������ 1~5����ϱ�");
		i = 1;
		do{System.out.println(i+" "); i++;
		
		}while(i <=5);
	}
}
