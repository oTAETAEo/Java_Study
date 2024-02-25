package ch08.sec04;

public class Maim {

	public static void main(String[] args) {

		// 인터페이스 변수가 가지는 객체 선언.
		RemoteControl rc = new Television();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
			
		// 인터페이스 변수 가 가지는 객체 변환.
		// 인터페이스를 사용하는 방법은 똑같지만 대입 하는 객체에 따라 값이 달라진다.
		rc = new Audio();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}

}
