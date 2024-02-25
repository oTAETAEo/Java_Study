package ch09.sec07.exam01;

public class Main {

	public static void main(String[] args) {
		
		// 익명 객체.
		// 명시적으로 클래스 파일이나 클래스 파일 하나에 클래스를 또 만들어 코드가 복잡해지지 않기 위해 사용한다.
		// 클래스에서 익명 객체를 사용하면 익명 자식 객체라고 불린다.
		// new 클래스명() {}; 으로 쓰인다 클래스명이라고 적혀 있는데 그 클래스를 부모로 가지는 익명 객체가 만들어진다는 것이다.
		// 중괄호 안에는 부모 클래스의 메소드를 오버라이딩 한다.
		
		Car car = new Car();
		
		car.run1();
		
		car.run2();
		
		// 매개값으로 주는 경우 익명 자식 객체를 만드는 방법.
		// Tire를 상속한 자식 클래스 객체를 매게값으로 재공한다.
		car.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 Tire 객체3이 굴러갑니다");
			}
		});
	}

	// 그냥 new 객체 생성 코드에 {} 괄호만 붙이면 그 클래스를 부모로 가지는 클래스를
	// 생성하고 그 안에는 재정의 된 코드가 있을수 있다.
}
