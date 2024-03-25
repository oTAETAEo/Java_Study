package ch17.sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {

		String[] strings = {"홍길동", "김길동", "서길동"};
		Stream<String> stream = Arrays.stream(strings);
		stream.forEach(t -> {
			System.out.print(t + ",");
		});
		
		System.out.println();
		
		int[] num = {1,20,320,515};
		IntStream intStream = IntStream.of(num);
		intStream.forEach(value -> {
			System.out.print(value + ",");
		});
		
	}

}
