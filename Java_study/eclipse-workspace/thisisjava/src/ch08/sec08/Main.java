package ch08.sec08;

public class Main {

	public static void main(String[] args) {
		
		// 여기에는 SmartTelevision 객체는 RemoteControl를 인터페이스로 사용할수있다.
		// SmartTelevision에 저장 되어있는 메소드는 3개이지만 RemoteControl
		// 인터페이스에 선언 되어있는 추상 메소드는 2개이기 때믄에 이 인터페이스에 저장되어있는
		// 메소드만을 사용할수 있다.
		RemoteControl rc1 = new SmartTelevision();
			
		rc1.turnOn();
		rc1.turnOff();
			
		// 위와 마찬가지로 Search 인터페이스에 한가지의 추상 메소드가 저장 되어있기 때문에
		// 하나의 메소드만을 사용할수 있다.
		Search rc2 = new SmartTelevision();
		
		rc2.search("https://papago.naver.com/");
		
		// 하나의 클래스에 인터페이스는 여러개 가질수 있지만 사용할수 있는 메소드는 각각의 인터페이스
		// 에 선언 되어 있는 메소드만을 사용할수 있다.
	}
}
