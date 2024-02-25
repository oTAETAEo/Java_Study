package ch08.sec10.exam02;

public class Main {

	public static void main(String[] args) {
		
		// Vehicle 인터페이스를 사용할 Bus 객체는 자동으로 형변환이 된다.
		Vehicle vehicle= new Bus();
		
		// 자동으로 형변환 되기 때문에 사용할수 있는 메소드는 인터페이스에 선언 되어있는 메소드만을
		// 사용할수 있다.
		vehicle.run();
		
		// 여기서 bus 클래스에 저장되어 있는 메소드를 사용하고 싶으면
		// 강제 형변환을 시켜준다.
		Bus bus = (Bus)vehicle;
		
		// 강제 형변환을 통해 인터페이스에서 오버라이딩한 메소드와 Bus 클래스에 있는 메소드를
		// 사용할수 있다.
		bus.run();
		bus.checkFare();
		
		// 객체 타입 변환과 같이 인터페이스로 형 변환 되기 전의 객체 타입으로만 다시 변할수 있다
		
		// 상속의 다형성. 메소드 재정의 자동 타입 변환
		// 인터페이스의 다형성. 메소드 재정의 자동 타입 변환
	}

}
