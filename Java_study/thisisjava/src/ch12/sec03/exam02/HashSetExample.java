package ch12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<Student> hashSet = new HashSet<Student>();
		
		Student student1 = new Student("홍길동", 1);
		Student student2 = new Student("홍길동", 1);

		// HashSet 자료구조는 동등 객체는 하나만 저장한다 이 기능을 사용하려면 자료구조에 넣을 클래스에
		// hashCode(), equals()이 동등객체를 비교하는 코드로 오버라이딩이 되어있어야 한다.
		
		// hashCode()가 동등객체를 비교하는 코드로 오버라이딩이 되어있지 않으면 객체의 번지를 해싱해서 리턴해주기 때문에
		// 값이 무조껀 다를수 밖에 없다.
		
		hashSet.add(student1);
		System.out.println("크기: " + hashSet.size());
		
		hashSet.add(student2);
		System.out.println("크기: " + hashSet.size());
		
		// 다른 객체가 들어감으로 size가 ++ 된다.
		Student student3 = new Student("홍길동", 10);

		hashSet.add(student3);
		System.out.println("크기: " + hashSet.size());
	}

}
