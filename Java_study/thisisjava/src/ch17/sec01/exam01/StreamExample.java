package ch17.sec01.exam01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {

		Set<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("김길동");
		set.add("김자바");
		
		for(String string : set) {
			System.out.println(string);
		}
		
		System.out.println();
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// 내부 반복자.
		Stream<String> stream = set.stream();
		
		// 람다식으로 처리방법을 지정해 준다.
		stream.forEach(t -> {
			System.out.println(t + "입니다.");
		});
		
		
	}

}
