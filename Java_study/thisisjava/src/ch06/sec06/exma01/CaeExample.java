package ch06.sec06.exma01;

public class CaeExample {

	public static void main(String[] args) {
		
		// Car 객체 생성 new = 생성 키워드
		Car mycar1 = new Car();
		
		// Car 객체의 필드값 읽기
		// 필드에서 값이 초기화되어 있지 않으면 각각의 타입에 맞는 초기값이 들어간다.
		System.out.println("모델명: " + mycar1.model);
		System.out.println("시동: " + mycar1.start);
		System.out.println("속도: " + mycar1.speed);
		
		// 생성자 오버로딩을 해 위처럼 객체를 생성해도 되고 아래처럼 생성해도 된다.
		// 매개값을 주고 생성할때 각각에 맞는 매개변수가 선언되어있는 생성자가 실행되어 생성된다.

		// 생성자의 맞는 매개값을 주어서 객체를 생성한다.
		// this.매개변수 를 사용해 매개값을 저장한다.
		Car mycar3 = new Car("현대자동차");
		Car mycar4 = new Car("현대자동차","검정");
		Car mycar2 = new Car("현대자동차","검정",200);

		System.out.println("모델명: " + mycar2.model);
		System.out.println("시동: " + mycar2.color);
		System.out.println("속도: " + mycar2.speed);
		
	}
}
