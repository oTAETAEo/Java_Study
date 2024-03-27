package ch17.sec10;

import java.util.Arrays;

public class AggregateExample {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		// 필터로 걸러낸 2의 배수의 개수 카운트.
		long count = Arrays.stream(arr)
				.filter(value -> value%2 == 0)
				.count();
		System.out.println(count);
		
		// 필터로 걸러낸 2의 배수의 총 합.
		long sum = Arrays.stream(arr)
				.filter(value -> value%2 == 0)
				.sum();
		System.out.println(sum);
		
		// 필터로 걸러낸 2의 배수의 평균
		// .getAsDouble()가 있는 이유는 .average()는 실수를 반환 하는게 아닌 Optional 객체를 리턴 하기 때문에
		// 객체 안에 있는 값을 가져오기 위해 사용.
		double avg = Arrays.stream(arr)
				.filter(value -> value%2 == 0)
				.average()
				.getAsDouble();
		System.out.println(avg);
		
		// 필터로 걸러낸 2의 배수의 최대값
		// getAsInt() 사용 이유는 위와 같다.
		int max = Arrays.stream(arr)
				.filter(value -> value%2 == 0)
				.max()
				.getAsInt();
		System.out.println(max);
		
		// 필터로 걸러낸 2의 배수의 최소값
		// getAsInt() 사용 이유는 위와 같다.
		int min = Arrays.stream(arr)
				.filter(value -> value%2 == 0)
				.min()
				.getAsInt();
		System.out.println(min);
		
		// 필터로 걸러낸 2의 배수중 첫번째로 나온 값.
		// getAsInt() 사용 이유는 위와 같다.
		int first = Arrays.stream(arr)
				.filter(value -> value%2 == 0)
				.findFirst()
				.getAsInt();
		System.out.println(first);
	}			
	
}
