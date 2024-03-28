package ch17.sec12.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import ch17.sec12.exam01.Student;

public class CollectExample {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동","남",92));
		list.add(new Student("김수영","여",87));
		list.add(new Student("감자바","남",95));
		list.add(new Student("오해영","여",93));
		
		Map<String, List<Student>> map = list.stream()
				.collect(Collectors.groupingBy(a -> a.getSex()));
		
		List<Student> maleList = map.get("남");
		maleList.stream()
		.forEach(t -> System.out.println(t.getName()));
		
		System.out.println();
		
		maleList = map.get("여");
		maleList.stream()
		.forEach(t -> System.out.println(t.getName()));
		
		// 그룹화 된 리스트의 평균 구하기 두 코드는 동일한 값 리턴.
		OptionalDouble avg1 =  maleList.stream()
				.mapToDouble(value -> value.getScore())
				.average();	
		System.out.println(avg1.getAsDouble());
		
		double avg2 =  maleList.stream()
				.mapToDouble(value -> value.getScore())
				.average()
				.getAsDouble();
		System.out.println(avg2);
	}

}
