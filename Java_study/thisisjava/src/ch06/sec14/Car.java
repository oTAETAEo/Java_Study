package ch06.sec14;

public class Car {

	// Getter와 Setter 는 필드 변수가 공개되지 않았을 경우 값을 가져와 세팅 하거나
	// 값을 리턴 해주는 메소드를 칭한다.

	// 필드선언
	private int speed;
	private boolean stop;
	
	// Getter와 Setter 
	// 메소드이다.

	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;			
		}
	}
	
	// 리턴 값이 boolean 타입이면 메소드 명은 is로 시작한다.
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		if(stop == true) {
			this.speed = 0;
		} else {
			this.speed = 0;	
		}
	}
}
