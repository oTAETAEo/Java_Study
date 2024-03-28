package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		
		// 컬랙션 안에 저장 되어 있는 객체가 없는데 스트림을 실행시키면 예외가 발생한다
		// java.util.NoSuchElementException
//		double avg =  list.stream()
//				.mapToInt(value -> value.intValue())
//				.average()
//				.getAsDouble();
		
		// 예외 처리 방법 1.
		// OptionalDouble에 있는 메소드로 집계값이 있을경우 아닌 경우를 bool 타입으로 리턴한다.
		OptionalDouble optionalDouble = list.stream()
				.mapToInt(value -> value.intValue())
				.average();
		if(optionalDouble.isPresent()) {
			System.out.println("(방법 1) 평균 : " + optionalDouble.getAsDouble());
		}else {
			System.out.println("(방법 1) 평균 : " + 0.0);
		}

		// 예외 처리 방법 2.
		// orElse 메소드로 객체가 없을 경우의 디폴트 값을 정해준다.
		double avg = list.stream()
				.mapToInt(value -> value.intValue())
				.average()
				.orElse(0.0);
		System.out.println("(방법 2) 평균 : " + avg);
		
		// 예외 처리 방법 3.
		// ifPresent을 사용하면 객체가 있으면 알아서 실행이 된다.
		list.stream()
		.mapToInt(value -> value.intValue())
		.average()
		.ifPresent(value -> System.out.println("(방법 3) 평균 : " + value));
		
		// 여기서 average는 최종 처리 메소드이기 때문에 그 아래 있는 매소드는 average가 리턴하는 OptionalXXX의 메소드를 실행 하는것이다.
	}

}
