package ch07.sec04;

public class CompuyeExample {

	public static void main(String[] args) {

		// 메소드 오버라이딩을 배운다.
		
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println(calculator.areaCircle(r));
		
		// 재정의된 메소드로 실행이 된다.
		Computer computer = new Computer();
		System.out.println(computer.areaCircle(r));
		
		// 오버라이딩 전 calculator 클래스의 sumCount매소드.
		calculator.sumCount(1,2,3,4,5);
		
		// 오버라이딩 후 Computer 클래스의 sumCount매소드.
		computer.sumCount(1,2,3,4,5);
		
	}
}
