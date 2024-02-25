package ch08.sec06;

public class Audio implements RemoteControl{

	// 외부에서 접근 불가.
	private int volume;
	private int memoryVolume;
	
	// 인터페이스에 선언되어있는 추상 메소드 재정의
	@Override
	public void turnOff() {
		System.out.println("Audio를 켭니다");
	}
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 끕니다");
	}
	
	// 최대, 최저 볼륨을 상수로 인터페이스에 저장 하고 사용한다.
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}

	@Override
	public int getVolume() {
		return this.volume;
	}
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리 합니다");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다");
			this.volume = this.memoryVolume;
		}
	}
	
	
	
}















