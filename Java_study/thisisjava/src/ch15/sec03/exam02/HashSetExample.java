package ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		Set<Member> set = new HashSet<Member>();
		
		// Member 클래스에서 hashcode, equals 메소드를 동등객체를 찾는 메소드로 재정의를 했다.
		set.add(new Member("홍길동", 20));
		set.add(new Member("홍길동", 20));
		
		System.out.println(set.size());
		
		
	}

}
