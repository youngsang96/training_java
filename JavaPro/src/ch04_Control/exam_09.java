package ch04_Control;

import java.util.Scanner;
/*�Էµ� ����Ʈ�� ������ ��� ��ǰ�� ����Ʈ �ϼ���
 * 0 ~ 199 : ��ǰ�� �����ϴ�
 * 200 ~ 399 : �����
 * 400 ~ 599 : �ڵ���
 * 600 ~ 799 : �ڵ���
 * 800 ~ 999 : ����Ʈ
 * 
 *  850 :  ����Ʈ,�ڵ���,�ڵ���,�����
 *  730 :  ��ǻ��,�ڵ���,�����
 *  160 :  ��ǰ�� �����ϴ�
*/
public class exam_09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("����Ʈ���� �Է��ϼ���:");
		int point = 0;
		while(true){
			point=scan.nextInt();
			if(point == 9999) {
				System.out.println("exit");
			break;}
			
			System.out.println(point+"��");
			switch(point/200) {
			case 0 : System.out.println("��ǰ�� �����ϴ�."); break;
			case 4 : System.out.print("����Ʈ,");
			case 3 : System.out.print("�ڵ���,");
			case 2 : System.out.print("�ڵ���,");
			case 1 : System.out.println("�����");	
			}
		}
	}
}