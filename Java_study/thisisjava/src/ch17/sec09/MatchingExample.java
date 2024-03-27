package ch17.sec09;

import java.util.Arrays;

public class MatchingExample {

	public static void main(String[] args) {

		int[] intArr = {2,4,6};
		
		// 모든 요소가 2의 배수이면 true
		boolean result = Arrays.stream(intArr)
				.allMatch(value -> value%2 == 0);
		System.out.println(result);
		
		// 모든 요소중 하나만이라도 3의 배수이면 true
		result = Arrays.stream(intArr)
				.anyMatch(value -> value%3 == 0);
		System.out.println(result);
		
		// 모든 요소중에 3의 배수가 없으면 true
		result = Arrays.stream(intArr)
				.noneMatch(value -> value%3 == 0);
		System.out.println(result);
		
	}

}
