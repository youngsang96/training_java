package ch04_Control;
/*
 * switch ������ ���Ǵ� �ڷ���
 *    => byte, short, int, char, String (0)
 *    
 * switch ������ ������ �ʴ� �ڷ���
 *    => boolean, long, float, double(x)
 *    
 * ���ǹ� : if, switch
 *    ��� switch ������ if������ ���� ������.     
 *    ��� if ������ switch �������� ������ �� ����. ���� ���ɰ͵� �ְ� ���� �Ұ��� �͵� ����
 */

public class ControlEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 1;
		switch(value) {
		case 1 : System.out.println(value); break;
		case 2 : System.out.println(value); break;
		default: System.out.println(value); break;
		}
	}

}
