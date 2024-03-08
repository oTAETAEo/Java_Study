package ch14.sec04.exam03;

public class YieldExample {

	public static void main(String[] args) {
		
		WorkThread workThread1 = new WorkThread("Thread1");
		WorkThread workThread2 = new WorkThread("Thread2");
		workThread1.start();
		workThread2.start();
		
		try {
			Thread.sleep(5000);
			workThread1.work = false;
		} catch (InterruptedException e) {
		}
		
		try {
			Thread.sleep(5000);
			workThread1.work = true;
		} catch (InterruptedException e) {
		}
	}

}
