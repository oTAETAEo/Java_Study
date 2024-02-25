package ch06.sec14;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		// 음수값이 들어가면 setSpeed 메소드가 speed를 0으로 바꾼다.
		myCar.setSpeed(-50);
		System.out.println(myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println(myCar.getSpeed());
		
		// 리턴 값이 boolean 타입이면 메소드 명은 is로 시작한다.
		// 정지 상태이면
		if(!myCar.isStop()) {
			// setStop 메소드가 speed를 0으로 만든다.
			myCar.setStop(true);
		}
		
		System.out.println(myCar.getSpeed());

	}

}
