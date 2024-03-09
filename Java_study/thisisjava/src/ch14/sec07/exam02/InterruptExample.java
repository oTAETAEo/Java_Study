package ch14.sec07.exam02;

public class InterruptExample {

	public static void main(String[] args) {
		
		Thread thread = new PrintThread();
		thread.start();
		
		// interrupt() 메소드가 실행되었다고 모두 일시정지 하는것이 아니다.
		// 실행되는 메소드 run안에 일시정지 상태로 만드는 코드가 있어야지 작동한다.
		thread.interrupt();
	}
}
