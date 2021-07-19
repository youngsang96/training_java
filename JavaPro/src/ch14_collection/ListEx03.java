package ch14_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * ȭ�鿡�� ���ڸ� ������ �Է¹ް�, �� �߿� Ȧ���� �ڿ����鸸 ���� ���ϰ�, 
 * Ȧ�� �� �ִ밪, �ּҰ��� ����ϱ�
 * �ִ밪�� �ε���, �ּҰ��� �ε����� ����ϱ�
 */
public class ListEx03{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ڿ����� ������ �Է��ϼ���(����:0)");
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		while (true) {
			int num = scan.nextInt();
			if (num % 2 == 1) { // Ȧ��
				list.add(num);
				sum += num;
			} else if (num == 0) {
				break;
			}
		}
		System.out.println("�Էµ� Ȧ�� :" + list);
		for (Integer i : list) {
			System.out.println(i);
		}
		System.out.println("Ȧ���� ��:" + sum);
		System.out.println("�ִ밪:" + Collections.max(list) 
		+ ",index:" + list.indexOf(Collections.max(list)));
		System.out.println("�ּҰ�:" + Collections.min(list) 
		+ ",index:" + list.indexOf(Collections.min(list)));
	}
}