package ch12.sec03.exam05;

import java.util.HashSet;

public class MemberExample {

	public static void main(String[] args) {
		Member m1 = new Member("fall", "단풍이");
		Member m2 = new Member("fall", "단풍이");

		// toString() 실행
		System.out.println(m1);
		System.out.println(m2);
		
		// 해시코드가 이 클래스의 필드 값으로 재정의 되어있기 때문에 동일한 값이 나온다.
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());

		System.out.println(m1.equals(m2));
		
		HashSet<Member> hashSet = new HashSet<Member>();
		hashSet.add(m1);
		hashSet.add(m2);
		
		// 동등객체이기 떄문에 하나만 저장되어 있다.
		System.out.println(hashSet.size());
		
		System.out.println(System.nanoTime());
	}

}
