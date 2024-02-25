package ch08.sec05;

public class Television implements RemoteControl{

	// 외부에서 접근 불가.
	private int volume;
	
	// 인터페이스에 선언되어있는 추상 메소드 재정의
	@Override
	public void turnOff() {
		System.out.println("TV를 켭니다");
		
	}
	
	@Override
	public void turnOn() {
		System.out.println("TV를 끕니다");
		
	}
	
	@Override
	public int getVolume() {
		return this.volume;
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
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
}
