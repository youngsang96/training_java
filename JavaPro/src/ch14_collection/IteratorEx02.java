package ch14_collection;
import java.util.*;
/*
 * HashMap?? Iterator?? ?????Ͽ? ????Ʈ?Ѵ? 
 * Collection : co.interator();
 * Set:  set.iterator()
 * List: li.interator()
 * Map  --->  Iterator;
 * Map -> Set: keySet() -> iterator()
 * Map -> Set: entrySet() ->iterator()
 * Map -> Collection : values() -> iterator()
 */

public class IteratorEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>(); //Map ?÷??? ????
		//??ü ????
		map.put("???ڹ?",85); map.put("ȫ?浿",90);
		map.put("???屺",80); map.put("ȫ?浿",95);
		System.out.println("?? entry ??: "+ map.size());
		System.out.println("======================");
		//??ü ã??
		System.out.println("\tȫ?浿 : "+ map.get("ȫ?浿"));
		System.out.println("==========Map=========");
		//map.keySet()
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value= map.get(key);
			System.out.println("\t"+key+" : "+ value);
		}
		System.out.println();
		System.out.println("=========Entry========");
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIt = entrySet.iterator();
		
		while (entryIt.hasNext()) {
			Map.Entry<String, Integer> en = entryIt.next();
			System.out.println("\t"+en.getKey()+" : "+ en.getValue());
		}
		System.out.println();
		System.out.println("=========Values========");
		Collection<Integer> c = map.values();
		Iterator<Integer> valueIterator = c.iterator();
		
		while(valueIterator.hasNext()) {
			Integer value = valueIterator.next();
			System.out.println("\t   "+value);
		}
		System.out.println();
		map.clear(); //??ü ??ü ????
		System.out.println("?? Entry ??: "+map.size());
	}

}
