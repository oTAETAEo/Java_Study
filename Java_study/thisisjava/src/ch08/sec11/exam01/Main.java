package ch08.sec11.exam01;

public class Main {

	public static void main(String[] args) {
		
		// 객체 선언
		Car car = new Car();
		
		// car에 선언된 인터페이스 변수 필드에 HankookTire 객체 대입.
		car.tire1 = new HankookTire();
		car.tire2 = new HankookTire();
		
		// car의 매소드 실행
		car.run();
		
		// car에 선언된 인터페이스 변수 필드에 KumhoTire 객체 대입.
		car.tire1 = new KumhoTire();
		car.tire2 = new KumhoTire();
		
		// car의 매소드 실행
		car.run();
	}

}
