package ch09.sec07.exam01;

public class Car {
	
	private Tire tire1 = new Tire();
	
	// 익명 자식 객체 
	// Tire를 상속한 익명 자식 객체를 만들어서 대입한다.
	// 중괄호가 붙으면 완전히 다른 뜻이 된다.
	private Tire tire2 = new Tire() {
		@Override
		public void roll() {
			System.out.println("익명 자식 Tire 객체1이 굴러갑니다");
		}
	};
	
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	public void run2() {
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체2이 굴러갑니다");
			}
		};
		// 재정의 된 매소드를 실행한다.
		tire.roll();
	}
	
	public void run3(Tire tire) {
		tire.roll();
	}
}
