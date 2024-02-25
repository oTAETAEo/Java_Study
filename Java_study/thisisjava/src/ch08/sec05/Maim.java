package ch08.sec05;

public class Maim {

	public static void main(String[] args) {

		// 인터페이스 변수가 가지는 객체 선언.
		RemoteControl rc = new Television();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	
		// 인터페이스에 구현 객체가 선언 되어있지 않으면 실행 불가.
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println("현재 볼륨: " + rc.getVolume());
		
		rc = new Audio();
		
		rc.setVolume(7);
		rc.setMute(true);
		rc.setMute(false);
		System.out.println("현재 볼륨: " + rc.getVolume());
	}

}
