package solve;

import java.util.Scanner;
/*
 * ���� �����ڸ� �̿��ϱ�
 * ������ �Է¹޾Ƽ� 90�̻��̸� "A����" 80�̻��̸� "B����" 70�̻��̸� "C����"
 *              60�̻��̸� "D����" �׿ܴ� "F����" ����ϱ�
 *              ���� ������ ��� �ϼ��� 
 */
public class ex1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		String grade = (score >= 90)? "A����" : (score >= 80)? "B����" : (score >= 70)? "C����" : (score >= 60)? "D����" : "F����";    
		System.out.println(grade);
	}

}
