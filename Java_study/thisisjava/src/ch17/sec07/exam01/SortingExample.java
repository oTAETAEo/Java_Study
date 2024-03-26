package ch17.sec07.exam01;

import java.util.ArrayList;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동",52));
		list.add(new Student("김길동",95));
		list.add(new Student("서길동",45));
		
		list.stream()
		.sorted()
		.forEach(t -> {
			System.out.println(t.getName() + " " + t.getScore());
		});
		
		System.out.println();
		
		list.stream()
		.sorted((o1, o2) -> Integer.compare(o1.getScore(), o2.getScore()))
		.forEach(t -> {
			System.out.println(t.getName() + " " + t.getScore());
		});
		
		List<Person> list2 = new ArrayList<Person>();
		list2.add(new Person("홍길동",50));
		list2.add(new Person("김길동",20));
		list2.add(new Person("서길동",12));
		
		// 객체가 Comparable 인터페이스를 구현 하고 있지 않을때 sortde를 사용하면 ClassCastException 예외가 발생
//		list2.stream()
//		.sorted()
//		.forEach(t -> System.out.println(t.getAge()));
		
		System.out.println();

		// ClassCastException 구현 하지않은 객체는 람다식으로 비교자를 주어서 비교할수 있다.
		list2.stream()
		.sorted((o1, o2) -> {
			if(o1.getAge() < o2.getAge())
				return 1;
			else if(o1.getAge() == o2.getAge())
				return 0;
			else 
				return -1;
		})
		.forEach(t -> System.out.println(t.getAge()));
		
	}

}
