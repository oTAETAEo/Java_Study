package ch14.sec09.exam01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

	public static void main(String[] args) {

		// 인터페이스 변수에 Executors의 정적 메소드 newFixedThreadPool()를 실행시킨다.
		// 스레드풀 생성.
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		// 스레드풀 종료.
		executorService.shutdownNow();
		
	}

}
