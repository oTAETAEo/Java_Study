package ch14.sec03.exam03;

public class BeepPrintExample {

	public static void main(String[] args) {
		
		// 클래스를 상속해서 만들경우 익명 자식 클래스라고 한다. 
		Thread thread = new Thread() {

			@Override
			public void run() {
				for(int i = 1; i <= 5; i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		thread.start();
		
//		for(int i = 1; i <= 5; i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		
		// Thread 클래스를 상속 받아서 만든 클래스 실행.
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		// 다른곳에서도 이런 코드가 필요하다면 재사용성을 높이기 위해 따로
		// 클래스로 정의해 놓아도 된다.
		// 한번만 필요하다면 익명 구현객체나 자식객체로 생성해 사용한다.
	}
}
