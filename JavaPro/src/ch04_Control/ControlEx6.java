package ch04_Control;
/* �׿� ��� 
 *   break  : �ݺ����̳� switch ������ ����
 *   continue : �ݺ����� ó������ ��� �̵�
 */

public class ControlEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2; i<=9; i++) {
			System.out.println("\n" + i +"��");
			for(int j=1; j<=9; j++) {
			    //if(j==5) continue;
			    if(j==5) break;
				System.out.println(i + "*" + j +"=" + (i*j));
			}
		}
	}
}
