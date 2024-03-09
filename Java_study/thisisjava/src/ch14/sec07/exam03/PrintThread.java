package ch14.sec07.exam03;

public class PrintThread extends Thread{

	@Override
	public void run() {

		// exam02 처럼 sleep 코드를 적기 싫다면 
		// isInterrupted 인스턴스 메소드를 사용하거나 Thread.interrupted() 정적 메소드를 사용해 방해를 받았는지 확인을해
		// true,false 값을 리턴 받아 사용한다.

		while(true) {
			System.out.println("실행중...");
			if(this.isInterrupted()) {
				break;
			}
			if(Thread.interrupted()) {
				break;
			}
		}
		
		System.out.println("리소스 정리.");
		System.out.println("실행종료.");

	}
}
