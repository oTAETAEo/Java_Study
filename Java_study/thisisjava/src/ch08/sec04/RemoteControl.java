package ch08.sec04;

public interface RemoteControl {
	
	// 인터페이스에 선언 되어있는 필드는 모수 상수이다.
	// static이 붙었기 때문에 정적 필드이다.
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 인터페이스에서 사용할수 있는 기능은 3가지.
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
