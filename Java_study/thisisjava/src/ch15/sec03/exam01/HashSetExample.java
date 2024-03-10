package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		// 동등 객체는 저장되지 않는다.
		set.add("asd");
		set.add("asd");
		set.add("adc");
		set.add("avc");
		set.add("asb");

		System.out.println(set.size());
	}

}
