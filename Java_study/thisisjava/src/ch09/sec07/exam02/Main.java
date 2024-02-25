package ch09.sec07.exam02;

public class Main {

	public static void main(String[] args) {
		
		// 익명 구현 객체.
		// 익명 구현 객체는 인터페이스를 재정의한 익명 객체를 말한다.
		// new 인터페이스명 {}; 로 사용되고 중괄호 안에는 인터페이스명의 추상 메소드를 재정의한 코드가 작성이 된다.
		// 익명 자식 객체와 사용 방법은 똑같이 메소드에서 매개값으로 줄수도 있고 로컬 변수에서 재정의, 필드에서 재정의 될수 있다.
		
		Home home = new Home();
		home.use1();
		
		home.use2();
		
		// 익명 구현 객체를 만들어서 매개값을 준다.
		home.use3(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("난방을 켭니다");
			}
			
			@Override
			public void turnOff() {
				System.out.println("난방을 켭니다");
			}
		});
	}

}
