package ch08.sec11.exam01;

public class Car {

	// 인터페이스 필드 선언.
	Tire tire1;
	Tire tire2;
	
	// 인터페이스 필드에 저장된 메소드 실행 메소드
	void run() {
		tire1.roll();
		tire2.roll();
	}
}
