package ch14.sec08;

public class DaemonExample {

	public static void main(String[] args) {
		
		AutoSaveThread thread = new AutoSaveThread();
		thread.setDaemon(true);
		thread.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		// 메인 스레드가 종료되면 데몬 스레드도 같이 종료된다.
		System.out.println("메인 스레드 종료.");
	}
}

// 기준이 되는 스레드에서 setDaemon()이 실행 되고 start()된 스레드는
// 기준이 되는 스레드가 종료가 되면 같이 종료가 된다.