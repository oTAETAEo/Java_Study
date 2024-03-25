package ch17.sec02;

import java.util.List;
import java.util.Vector;
import java.util.stream.Stream;

public class ParallelStreamExample {

	public static void main(String[] args) {
		
		List<String> list = new Vector<String>();
		
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("람다식");
		list.add("박병렬");
		
		// 병렬스트림을 얻는다.
		Stream<String> stream = list.parallelStream();

		stream.forEach(t -> {
			System.out.println(t + ": " +Thread.currentThread().getName());
		});
	}

}
