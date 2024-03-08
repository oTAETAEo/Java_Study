package ch14.sec06.exam02;

public class WaitNotifyExample {

	public static void main(String[] args) {
		
		// 작업 공유 객체 생성.
		WorkObject workObject = new WorkObject();
		
		// 스레드 2개 생성.
		Thread1 thread1 = new Thread1(workObject);
		Thread2 thread2 = new Thread2(workObject);
		
		// 스레드 실행.
		thread1.start();
		thread2.start();
		
		
		
	}

}
