package ch08.sec02;

public class Main {

	public static void main(String[] args) {
		
		// rc를 가지고 Television을 사용한다 라는 뜻.
		RemoteControl rc;
		// RemoteControl 이 인터페이스로 사용이 가능한 객체만 올수 있다.
		rc = new Television();
		rc.turnOn();
		
		// 인터페이스 번수에서 사용하는 객체는 Audio 객체이다.
		rc = new Audio();
		rc.turnOn();
		
	}

}
