package ch17.sec05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FileteringExample {

	public static void main(String[] args) {

		
		List<String> list = new ArrayList<String>();
		list.add("홍길동"); 
		list.add("신용권"); 
		list.add("신용권"); 
		list.add("감자바"); 
		list.add("신민철"); 
		
		// 중복제거.
		list.stream()
		.distinct()
		.forEach(t -> System.out.println(t));
		
		System.out.println();
		
		// 시작 단어가 '신'이면 true
		list.stream()
		.filter(t -> t.startsWith("신"))
		.forEach(t -> System.out.println(t));
		
		System.out.println();
		
		// 두가지 같이 사용가능.
		list.stream()
		.distinct()
		.filter(t -> t.startsWith("신"))
		.forEach(t -> System.out.println(t));
		
	}

}
