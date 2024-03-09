package ch14.sec07.exam02;

public class PrintThread extends Thread{

	@Override
	public void run() {
		
		try {
			while(true) {
				System.out.println("실행중...");
				Thread.sleep(1);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("리소스 정리.");
		System.out.println("실행종료.");

	}
}
