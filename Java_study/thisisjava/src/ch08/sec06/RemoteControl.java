package ch08.sec06;

public interface RemoteControl {
	
	// 인터페이스에 선언 되어있는 필드는 모수 상수이다.
	// static이 붙었기 때문에 정적 필드이다.
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 인터페이스에서 사용할수 있는 기능은 3가지.
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	int getVolume();
	
	// default 메소드는 객체가 반듯이 있어야지 호출 가능하다.
	// 모든 객체의 기본 기능 모든 구현 클래스마다 각각 재정의 하면 중복이기 때문에 사용.
	// 모든 객체가 반듯이 있는 실행 방법을 default 메소드를 선언
	// 구현 클래스에서 맞지 않는 실행 방법일 경우 재정의가 가능하다.
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
			// 객체가 있어야 실행 되기 때문에 위에 있는 메소드 실행가능하다.
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// 정적 매소드 선언 
	// 객체 소속이 아니고 인터페이스 소속이다.
	// 객체 선언 없이 사용 가능하다.
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교환합니다");
	}
}
