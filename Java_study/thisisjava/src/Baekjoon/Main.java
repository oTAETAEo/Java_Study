package Baekjoon;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Sehoon", "Songwoo", "Chan", "Youngsuk", "Dajung");
		
		final List<String> star = names.stream()
				.filter(name -> name.startsWith("S"))
				.collect(Collectors.toList());
		System.out.println(star);
	}
}

