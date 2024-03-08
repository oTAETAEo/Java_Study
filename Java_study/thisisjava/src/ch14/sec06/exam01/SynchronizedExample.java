package ch14.sec06.exam01;

public class SynchronizedExample {

	public static void main(String[] args) {
		
		// 공유객체 생성.
		Calculator calculator = new Calculator();
	
		// 다른 스레드에 하나의 공유 객체를 넣었다.
		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalculator(calculator);
		user1Thread.start();
		
		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalculator(calculator);
		user2Thread.start();
		
		
	}

}
