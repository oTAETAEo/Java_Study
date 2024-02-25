package ch08.sec11.exam01;

//Tire를 인터페이스로 가지는 HankookTire 클래스.
public class HankookTire implements Tire{
	
	// 인터페이스에 선언 되어있는 추상 메소드 재정의.
	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다");
		
	}
}
