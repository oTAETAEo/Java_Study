package ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparbleExample {

	public static void main(String[] args) {

		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		// TreeSet은 Person객체만 받기 때문에 Person 객체를 생성해서 값을 넣어준다.
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("박지원", 31));
		
		// 저장되어 있는 값 출력.
		for(Person person : treeSet) {
			System.out.println(person.name + " " + person.age);
		}
	}

}
