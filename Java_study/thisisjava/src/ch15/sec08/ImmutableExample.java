package ch15.sec08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableExample {

	public static void main(String[] args) {

		// 불변 컬렉션 프레임워크 만들기 1.
		List<String> Immutablelist1 = List.of("A","B","C");
		
		Set<String> ImmutableSet1 = Set.of("A","B","C");
		
		Map<Integer, String> ImmutableMep1 = Map.of(
				1,"A",
				2,"B",
				3,"C");
		
		// 불변 컬렉션 프레임워크 만들기 2.
		// 복사해서 만드는것.
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("B");
		List<String> Immutablelist2 = List.copyOf(list);
		
		Set<String> set = new HashSet<String>();
		list.add("A");
		list.add("B");
		list.add("B");
		Set<String> ImmutableSet2 = Set.copyOf(set);
		
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(1,"A");
		map.put(2,"B");
		map.put(3,"B");
		Map<Integer,String> Immutablemap2 = Map.copyOf(map);
		
		// 불변 컬렉션 프레임워크 만들기 3.
		String[] str = {"aaa","bbb","ccc"};
		List<String> ImmutablArr = Arrays.asList(str);
		
	}

}














