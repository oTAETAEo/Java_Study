package ch08.sec10.exam02;

public class Bus implements Vehicle{

	// 인터페이스에 있는 추상 메소드 재정의.
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	// Bus 클래스가 가지고 있는 메소드
	public void checkFare() {
		System.out.println("승차요금을 확인합니다.");
	}
	
}
