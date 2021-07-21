package ch14_collection;
import java.util.*;
public class TreeMapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> scores = new TreeMap<Integer,String>();
		scores.put(87, "ȫ�浿"); scores.put(98, "�̵���"); scores.put(75, "�ڱ��");
		scores.put(95, "�ſ��"); scores.put(80, "���ڹ�");
		Map.Entry<Integer, String> entry = null;
		entry = scores.firstEntry();
		System.out.println("���� ���� ����: "+ entry.getKey() + "-" + entry.getValue()+"\n");
		entry = scores.lastEntry();
		System.out.println("���� ���� ����: "+ entry.getKey() + "-" + entry.getValue()+"\n");
		entry = scores.lowerEntry(new Integer(95));
		System.out.println("95�� �Ʒ� ����: "+ entry.getKey() + "-" + entry.getValue()+"\n");
		entry = scores.higherEntry(new Integer(95));
		System.out.println("95�� ���� ����: "+ entry.getKey() + "-" + entry.getValue()+"\n");
		entry = scores.floorEntry(new Integer(95));
		System.out.println("95���̰ų� �ٷ� �Ʒ� ����: "+ entry.getKey() + "-" + entry.getValue()+"\n");
		entry = scores.ceilingEntry(new Integer(85));
		System.out.println("85���̰ų� �ٷ� ���� ����: "+ entry.getKey() + "-" + entry.getValue()+"\n");
		
		while(!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey()+"-"+entry.getValue() + "(���� ��ü �� "+ scores.size()+")");
		}
	}

}
