package ch08.sec11.exam02;

public class Drive {

	// 메소드의 매개값을 인터페이스 타입으로 주면 매개변수의 타입의 인터페이스를 사용한 클래스
	// 객체가 올수 있다.
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}
