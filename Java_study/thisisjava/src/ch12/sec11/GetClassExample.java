package ch12.sec11;

import ch06.sec14.*;

public class GetClassExample {

	public static void main(String[] args) {
		
		// 이 코드로 클래스의 전체 이름을 알수 있다.
		Class class1 = Car.class;
		
		// 아래 코드도 위와 같다 (예외 발생하기 떄문에 try 문으로 작성해주어야함.)
//		Class class2 = Class.forName("ch06.sec14.Car");
		
		// 객체로 부터 클래스 객체를 얻는다.
//		Car car = new Car();
//		Class class3 = car.getClass();
		
		// 위의 방법은 모두 동일한 결과를 나타낸다.
		
		System.out.println(class1.getName());
		
	}

}
