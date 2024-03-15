package ch15.sec05.exam02;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.NavigableMap;

public class TreeMapExample {

	public static void main(String[] args) {

		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		
		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("description", 40);
		treeMap.put("ever", 50);
		treeMap.put("zoo", 80);
		treeMap.put("base", 20);
		treeMap.put("guess", 70);
		treeMap.put("cherry", 30);
		
		// TreeMap 정렬된 엔트리를 하나씩 출력.
		Set<Entry<String, Integer>> entrySet = treeMap.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println();
		
		// 특정 키에 대한 값 가져오기.
		Entry<String, Integer> entry = null;
		
		entry = treeMap.firstEntry();
		System.out.println("제일 앞 단어: " + entry.getKey());
		System.out.println();

		entry = treeMap.lastEntry();
		System.out.println("제일 뒤 단어: " + entry.getKey());

		entry = treeMap.lowerEntry("ener");
		System.out.println("ener 앞 단어: " + entry.getKey());

		System.out.println();

		// 내림차순으로으로 정렬하기.
		NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
		Set<Entry<String, Integer>> descendingEntrySet = descendingMap.entrySet();
		for(Entry<String, Integer> e : descendingEntrySet) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		System.out.println();
		
		// 범위 검색.
		System.out.println("[c~h 사이의 단어 검색]");
		descendingMap = treeMap.subMap("c", true, "h", false);
		descendingEntrySet = descendingMap.entrySet();
		for(Entry<String, Integer> e : descendingEntrySet) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}
