package ch14.sec04.exam02;

public class SumThreadExample {

	public static void main(String[] args) {
		
		SumThread sumThread = new SumThread();
		
		sumThread.start();
		
		try {
			// join()는 스레드가 실행후 종료가 될때까지 기다리는 메소드이다.
			// 사용 이유는 다른 스레드의 값을 사용할때 그 스레드가 종료 된 후에 사용할수 있기 때문에 사용한다.
			sumThread.join();
		} catch (InterruptedException e) {
			
		}
		
		System.out.println(sumThread.getSum());
	}

}
