package ch08.sec11.exam02;

public class Main {

	public static void main(String[] args) {
		
		// 각각의 객체 선언.
		Drive drive = new Drive();
		
		// Vehicle를 인터페이스로 가지는 클래스 객체 생성.
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		// Drive 클래스의 drive()메소드를 호출할때 주는 매개값은 Vehicle 인터페이스 타입이기
		// 때문에 Vehicle 인터페이스를 가지는 클래스를 매개값으로 줄수 있다.
		
		drive.drive(bus);
		drive.drive(taxi);
		
	}

}
