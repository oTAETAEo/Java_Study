package ch17.sec12.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동","남",92));
		list.add(new Student("김수영","여",87));
		list.add(new Student("감자바","남",95));
		list.add(new Student("오해영","여",93));
		
		// 필터링해 원하는 값을 가진 List 리턴.
		// Java16 에서는 스트림에서 바로 toList()를 실행해 얻을수 있다.
		List<Student> maleList = list.stream()
				.filter(t -> t.getSex().equals("남"))
				.toList();
		
		// 위와 동일한 값을 리턴한다
//		List<Student> maleList = list.stream()
//				.filter(t -> t.getSex().equals("남"))
//				.collect(Collectors.toList());
//		
		
		maleList.stream()
		.forEach(t -> System.out.println(t.getName()));
		
		System.out.println();
		
		Map<String, Integer> map = list.stream()
				.collect(Collectors.toMap(s -> s.getName(), s -> s.getScore()));
		
		System.out.println(map);
		
	}

}
