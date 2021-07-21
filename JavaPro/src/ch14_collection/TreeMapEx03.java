package ch14_collection;
import java.util.*;

public class TreeMapEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> treeMap = new TreeMap<String,Integer>();
		treeMap.put("apple", 10); treeMap.put("forever", new Integer(60));
		treeMap.put("description", new Integer(40));
		treeMap.put("ever", new Integer(50));
		treeMap.put("zoo", new Integer(10));
		treeMap.put("base", new Integer(20));
		treeMap.put("guess", new Integer(70));
		treeMap.put("cherry", new Integer(30));
		System.out.println("[c~f ������ �ܾ� �˻�]");
		NavigableMap<String,Integer> rangeMap = treeMap.subMap("c", true, "f", true);
		for(Map.Entry<String, Integer> entry : rangeMap.entrySet()) {
			System.out.println(entry.getKey() + " - "+entry.getValue()+ "������");
		}
	}

}
