package ch17.sec06.exam01;

import java.util.ArrayList;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", 85));
		list.add(new Student("홍길동", 92));
		list.add(new Student("홍길동", 87));
		
		list.stream()
		.mapToInt(value -> value.getScore()) // 매개변수.
		.forEach(value -> System.out.println(value));
		
	}

}
