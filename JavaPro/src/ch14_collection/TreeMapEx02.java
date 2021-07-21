package ch14_collection;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx02 {
	public static void main(String[] args) {
		TreeMap<Integer,String> scores = 
				new TreeMap<Integer,String>();
		scores.put(87, "ȫ�浿");		scores.put(98, "�̵���");
		scores.put(75, "�ڱ��");		scores.put(95, "�ſ��");
		scores.put(80, "���ڹ�");		
		NavigableMap<Integer, String> descendingMap 
		= scores.descendingMap();
		Set<Map.Entry<Integer,String>> descendingEntrySet 
		= descendingMap.entrySet();
		for(Map.Entry<Integer,String> entry : descendingEntrySet) {
			System.out.print(entry.getKey() + "-"
		+ entry.getValue() + " ");}
		System.out.println();		
		NavigableMap<Integer,String> ascendingMap 
		= descendingMap.descendingMap();
		Set<Map.Entry<Integer,String>> ascendingEntrySet 
		= ascendingMap.entrySet();
		for(Map.Entry<Integer, String> entry : ascendingEntrySet) {
			System.out.print(entry.getKey() + "-" 
		+ entry.getValue() + " ");
		}	
	}
}
