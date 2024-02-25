package ch09.sec07.exam02;

public class Home {

	// 필드
	
	// 익명 구현 객체
	// RemoteControl 인터페이스를 가진 클래스의 객체를 가진다.
	private RemoteControl rc = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다");
		}
	};
	
	// 생성자
	// 메소드
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
	
	public void use2() {
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("에어컨를 켭니다");

			}
			
			@Override
			public void turnOff() {
				System.out.println("에어컨를 끕니다");
			}
		};
		rc.turnOn();
		rc.turnOff();
	}
	
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
