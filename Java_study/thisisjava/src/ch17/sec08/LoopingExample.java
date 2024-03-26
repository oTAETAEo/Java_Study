package ch17.sec08;

import java.util.Arrays;

public class LoopingExample {

	public static void main(String[] args) {

		int[] intarr = {1,2,3,4,5};
		
		// 최종처리가 없기 때문에 이 스트림은 실행되지 않는다.
		Arrays.stream(intarr)
		.filter(value -> value%2 == 0)
		.peek(value -> System.out.println(value));
		
		int total = Arrays.stream(intarr)
		.filter(value -> value%2 == 0)
		.peek(value -> System.out.println(value))
		.sum();
		
		System.out.println("총합 " + total);
		
		// forEach는 최종처리이기 때문에 작동한다.
		Arrays.stream(intarr)
		.filter(value -> value%2 == 0)
		.forEach(value -> System.out.println(value));
	}

}
