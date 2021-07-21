package ch14_collection;
import java.util.*;
/*
 * HashMap을 Iterator로 수정하여 프린트한다 
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
		Map<String, Integer> map = new HashMap<String, Integer>(); //Map 컬렉션 생성
		//객체 저장
		map.put("나자바",85); map.put("홍길동",90);
		map.put("동장군",80); map.put("홍길동",95);
		System.out.println("총 entry 수: "+ map.size());
		System.out.println("======================");
		//객체 찾기
		System.out.println("\t홍길동 : "+ map.get("홍길동"));
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
		map.clear(); //객체 전체 삭제
		System.out.println("총 Entry 수: "+map.size());
	}

}
