package ch05_arr;
import java.util.Scanner;
/*
 * �߱� ����
 * 1)  �ý����� 4�ڸ��� ���� �ٸ� ���� ������ ��
 * 2)  ����ڰ� ����� ���� ���ߴ� ����
 *     �ڸ����� �´� ��� : ��Ʈ����
 *     �ڸ����� Ʋ������ ���ڰ� �����ϸ� : ��
 *     4��Ʈ������ �Ǹ� ����
 */

public class ArrEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int[] com=new int[4]; 
		int[] user=new int[4]; 
		Scanner scan = new Scanner(System.in); 
		
		for(int i =0; i<4; i++) { 
			com[i]= (int)((Math.random()*9)+1); 
		for(int j =0; j<i; j++) { 
			if(com[i]==com[j]) { 
				i--; 
				break; 
				} 
			} 
		}
		for(int a:com) {
		System.out.print(a+" ");
		}
		System.out.println();
		while(true) {
			System.out.print("���δٸ� 4�ڸ� ���� �Է��ϼ���: ");
			String input=scan.next();
			for(int i=0; i<user.length; i++) {
				user[i]=input.charAt(i)-'0';
			}
			int str=0;
			int ball=0;
			for(int i=0; i<com.length; i++) {
				for(int j=0; j<user.length; j++) {
					if(com[i] == user[j]) {
						if(i == j) {
							str++;
						}else {ball++;}
					}
				}
			}
		System.out.println(str+"s "+ ball+"b");
		if(str==4) {
			System.out.println("����");
			break;}
		}
	}
}


