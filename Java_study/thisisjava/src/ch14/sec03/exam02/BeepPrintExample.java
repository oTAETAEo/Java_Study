package ch14.sec03.exam02;

public class BeepPrintExample {

	public static void main(String[] args) {
		
		// Thread 생성.
		// 생성자에 Runnable() 인터페이스를 준다.
		// Runnable()에는 run이라는 메소드 하나만 선언 되어있다.
		// run을 재정의 하는부분에는 이 스레드가 실행될 코드를 작성한다.
		// 익명객체를 사용한다.
		Thread thread = new Thread(new Runnable() {
			
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
		});
		
		// Thread 실행. run 메소드를 직접 호출하지 않고 start를 사용한다
		thread.start();
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
