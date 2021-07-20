package ch14_collection;
import java.util.*;

public class MapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] names = {"È«±æµ¿","±è»ñ°«","ÀÌ¸ù·æ","ÀÓ²©Á¤","±è»ñ°«"};
		int[] nums = {1234, 4567, 2350, 9870, 3456};
		
		for(int i=0; i<names.length; i++) {
			map.put(names[i], nums[i]);
		}
		System.out.println(map);
		System.out.println("=============================================");
		//Key¿¡ ÇØ´çÇÏ´Â value°ª ¸®ÅÏ
		System.out.println("È«±æµ¿ÀÇ ¹øÈ£: "+ map.get("È«±æµ¿"));
		System.out.println("ÀÌ¸ù·æÀÇ ¹øÈ£: "+ map.get("ÀÌ¸ù·æ"));
		System.out.println("±è»ñ°«ÀÇ ¹øÈ£: "+ map.get("±è»ñ°«"));
		System.out.println("===================");
		//Key °ª¸¸ Á¶È¸
		System.out.println("Key¸¸ Á¶È¸");
		Set<String> keys = map.keySet();
		for(String k : keys) {
			System.out.println(k+"ÀÇ¹øÈ£" + map.get(k));
		}
		System.out.println("===================");
		//Value °ª¸¸ Á¶È¸
		System.out.println("Value°ª¸¸ Á¶È¸");
		Collection<Integer> values = map.values();
		for(Integer v : values) {
			System.out.println(v);
		}
		System.out.println("===================");
		//Key, Value ½ÖÀ¸·Î Á¶È¸
		System.out.println("(Key, Value) °´Ã¼ Á¶È¸");
		Set<Map.Entry<String,Integer>> entry = map.entrySet();
		for(Map.Entry<String,Integer> m : entry) {
			System.out.println("("+ m.getKey()+", "+ m.getValue()+")");
			System.out.println(m);
		}
	}

}
