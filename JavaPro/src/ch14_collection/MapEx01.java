package ch14_collection;
import java.util.*;

public class MapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] names = {"ȫ�浿","���","�̸���","�Ӳ���","���"};
		int[] nums = {1234, 4567, 2350, 9870, 3456};
		
		for(int i=0; i<names.length; i++) {
			map.put(names[i], nums[i]);
		}
		System.out.println(map);
		System.out.println("=============================================");
		//Key�� �ش��ϴ� value�� ����
		System.out.println("ȫ�浿�� ��ȣ: "+ map.get("ȫ�浿"));
		System.out.println("�̸����� ��ȣ: "+ map.get("�̸���"));
		System.out.println("����� ��ȣ: "+ map.get("���"));
		System.out.println("===================");
		//Key ���� ��ȸ
		System.out.println("Key�� ��ȸ");
		Set<String> keys = map.keySet();
		for(String k : keys) {
			System.out.println(k+"�ǹ�ȣ" + map.get(k));
		}
		System.out.println("===================");
		//Value ���� ��ȸ
		System.out.println("Value���� ��ȸ");
		Collection<Integer> values = map.values();
		for(Integer v : values) {
			System.out.println(v);
		}
		System.out.println("===================");
		//Key, Value ������ ��ȸ
		System.out.println("(Key, Value) ��ü ��ȸ");
		Set<Map.Entry<String,Integer>> entry = map.entrySet();
		for(Map.Entry<String,Integer> m : entry) {
			System.out.println("("+ m.getKey()+", "+ m.getValue()+")");
			System.out.println(m);
		}
	}

}
