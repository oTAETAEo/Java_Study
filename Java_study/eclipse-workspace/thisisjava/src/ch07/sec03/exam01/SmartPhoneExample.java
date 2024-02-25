package ch07.sec03.exam01;

public class SmartPhoneExample {

	public static void main(String[] args) {

		// SmartPhone 객채를 생성했지만 Phone의 클래스 매소드도 사용이 가능하다
		// 이유는 SmartPhone 클래스가 Phone 클래스를 상속 받았기 때문이다.
		
		// smartPhone 객체가 생성 될때 내부적으로는 Phone 객체가 생성되고 SmartPhone 객체가 생성된것이다.
		SmartPhone myPhone = new SmartPhone("삼성", "검정");
		
		System.out.println(myPhone.model);
		System.out.println(myPhone.color);

	}

}
