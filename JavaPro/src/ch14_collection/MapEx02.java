package ch14_collection;
import java.util.*;

public class MapEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new Hashtable<String, String>();
		map.put("Spring", "12"); map.put("Summer", "123");
		map.put("Fall", "1234"); map.put("Winter", "12345");
		Scanner scanner = new Scanner(System.in);
		int count=0;
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
			System.out.print("���̵�: ");
			String id = scanner.nextLine();
			System.out.print("��й�ȣ: ");
			String password = scanner.nextLine();
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
					count++;
					if (count==5) break;
				}
			}else
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.");
			
		}
	}

}
