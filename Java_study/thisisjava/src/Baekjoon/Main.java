package Baekjoon;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		
		int[] num = {1000,1000};
		
		IntStream stream = Arrays.stream(num);
		double t = stream.average().getAsDouble();
		System.out.println(t);
		
		IntStream stream1 = IntStream.of(num);
		double t1 = stream1.average().getAsDouble();
		System.out.println(t);
		
		
	}
}

