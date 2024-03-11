package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		
		System.out.println("총 Entry 개수: " + map.size());
		System.out.println();
		
		String key = "홍길동";
		int num = map.get(key);
		System.out.println(key + ": " + num);
		System.out.println();
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String k = keyIterator.next();
			int v = map.get(k);
			System.out.println(k + ": " + v);
		}
		
		System.out.println();
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			int v = entry.getValue();
			System.out.println(k + ": " + v);
		}
		
		map.remove("홍길동");
		System.out.println();
		System.out.println("총 Entry 개수: " + map.size());
		
	}

}
