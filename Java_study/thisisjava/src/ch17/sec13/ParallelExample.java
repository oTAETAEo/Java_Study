package ch17.sec13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ParallelExample {

	public static void main(String[] args) {

		Random random = new Random();
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= 10; i++) {
			list.add(random.nextInt(101));
		}
		
		double avg = 0.0;
		long startTime = 0;
		long endTime = 0;
		
		startTime = System.nanoTime();
		avg = list.stream()
				.mapToInt(value -> value.intValue())
				.average()
				.getAsDouble();
		endTime = System.nanoTime();
		System.out.println("avg: " + avg + "일반 스트림 걸린 시간: " + (endTime-startTime));
		
		
		startTime = System.nanoTime();
		avg = list.parallelStream()
				.mapToInt(value -> value.intValue())
				.average()
				.getAsDouble();
		endTime = System.nanoTime();
		System.out.println("avg: " + avg + "병렬 스트림 걸린 시간: " + (endTime-startTime));
		
		// 요소가 적으면 병렬 스트림 보다 일반 스트림이 더 빠를수 있다 이유는 병렬은 스레트 풀 생성 시간 요소 분할등 여러
		// 추가적인 비용이 발생할수 있기 때문이다.
	}

}
