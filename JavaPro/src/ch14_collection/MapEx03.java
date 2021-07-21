package ch14_collection;
import java.util.*;

public class MapEx03 {
	static HashMap<String, Map<String, String>> phoneBook = new HashMap();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addPhoneNo("ģ��", "���ڹ�", "010-111-1111");
		addPhoneNo("ģ��", "���ڹ�", "010-222-2222");
		addPhoneNo("ģ��", "ȫ�浿", "010-333-3333");
		addPhoneNo("ȸ��", "��븮", "010-444-4444");
		addPhoneNo("ȸ��", "���븮", "010-555-5555");
		addPhoneNo("ȸ��", "�ڴ븮", "010-666-6666");
		addPhoneNo("ȸ��", "�̰���", "010-777-7777");
		addPhoneNo("��Ź","010-888-8888");
		printList();
	}
	//�׷쿡 ��ȭ��ȣ�� �߰��ϴ� �޼���
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap<String, String> group = (HashMap)phoneBook.get(groupName);
		group.put(tel, name);
	}
	static void addPhoneNo(String name, String tel) {
		addPhoneNo("��Ÿ",name,tel);
	}
	//�׷��� �߰��ϴ� �޼��� <String, HashMap()>
	static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName))
			phoneBook.put(groupName, new HashMap());
	}
	static void printList() {
		Set set = phoneBook.entrySet();
		Iterator<Map.Entry<String, Map<String,String>>> it = set.iterator();
		int count = 0;
		while(it.hasNext()) {
			count++;
			Map.Entry<String, Map<String,String>> e = it.next();
			Map<String, String> subMap = e.getValue();
			Set subSet = subMap.entrySet();
			Iterator<Map.Entry<String, String>> subIt = subSet.iterator();
			System.out.println(count+". "+e.getKey() + "["+subMap.size()+"]");
			
			while(subIt.hasNext()) {
				Map.Entry<String, String> subE = subIt.next();
				System.out.println(subE.getKey()+" "+ subE.getValue());
			}
			System.out.println();
		}
	}
}
