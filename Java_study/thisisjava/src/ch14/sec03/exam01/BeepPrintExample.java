package ch14.sec03.exam01;

public class BeepPrintExample {

	public static void main(String[] args) {
		
		// 이클립스에서 Toolkit 지원 종료에 대한 대체.
		
		// 숫자 출력 후 0.5초간 일시정지하는걸 반복하는 코드.
		// 메인 스레드 하나이기 때문에 첫 for문이 끝나고 다음 for문이 실행된다.
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
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
