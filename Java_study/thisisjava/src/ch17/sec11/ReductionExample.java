package ch17.sec11;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				new Student("홍길동", 92),
				new Student("신용권", 95),
				new Student("감자바", 88)
		);
		
		// 스트림에 값이 없으면 예외가 발생한다.
		int sum = list.stream()
				.mapToInt(value -> value.getScore())
				.sum();
		System.out.println(sum);
		
		// reduce는 커스텀 집계를 할수있고 첫 매개변수에는 디폴트 값을 지정해줄수 있다.
		// 2개를 받아서 1개를 리턴 하고 리턴한것과 또 다른 한개를 집계한다고 볼수 있다.
		// 매개변수를 하나로 사용하면 Optional 객체로 나온다 이유는 예외처리를 하기 위해서이다.
		// 2개를 받는다면 예외 처리를 할 필요가 없다 이유는 이미 디폴트 값을 가지고 있기 때문에 예외가 발생하면
		// 디폴트 값을 리턴하면 된다.
		sum = list.stream()
				.map(t -> t.getScore())
				.reduce(0, (a,b) -> a+b);
		System.out.println(sum);
		
	}

}
