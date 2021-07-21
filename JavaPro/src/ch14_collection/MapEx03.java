package ch14_collection;
import java.util.*;

public class MapEx03 {
	static HashMap<String, Map<String, String>> phoneBook = new HashMap();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addPhoneNo("친구", "이자바", "010-111-1111");
		addPhoneNo("친구", "김자바", "010-222-2222");
		addPhoneNo("친구", "홍길동", "010-333-3333");
		addPhoneNo("회사", "김대리", "010-444-4444");
		addPhoneNo("회사", "정대리", "010-555-5555");
		addPhoneNo("회사", "박대리", "010-666-6666");
		addPhoneNo("회사", "이과장", "010-777-7777");
		addPhoneNo("세탁","010-888-8888");
		printList();
	}
	//그룹에 전화번호를 추가하는 메서드
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap<String, String> group = (HashMap)phoneBook.get(groupName);
		group.put(tel, name);
	}
	static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타",name,tel);
	}
	//그룹을 추가하는 메서드 <String, HashMap()>
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
