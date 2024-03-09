package ch14.sec09.exam02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteExample {

	public static void main(String[] args) {
		
		String[][] str = new String[1000][3];
		
		for(int i = 0; i < 1000; i++) {
			str[i][0] = "ggg7515@naver.com";
			str[i][1] = "abc" + i + "gmail.com";
			str[i][2] = "신상품 입고";
		}
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		for(int i = 0; i< 1000; i++) {

			final int num = i;
			executorService.execute(new Runnable() {
				
				@Override
				public void run() {
					Thread thread = Thread.currentThread();
					String from = str[num][0];
					String to = str[num][1];
					String content = str[num][2];
					
					System.out.println("[" + thread.getName() + "]" + from + " ==> " + to + ": " + content);
				}
			});
		}
		
		executorService.shutdown();
	}

}
