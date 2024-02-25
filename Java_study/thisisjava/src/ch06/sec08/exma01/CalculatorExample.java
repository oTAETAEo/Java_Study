package ch06.sec08.exma01;

public class CalculatorExample {
	public static void main(String[] args) {
		
		
		// 객체 선언후 메소드 실행 방법.
		// static에 저장된 출력문이 실행된다.
		// static은 메모리로 로딩될때 살행된다.
		Calculator calculator = new Calculator();
		
		calculator.powerOn();
		
		int T = calculator.plus(5, 7);
		System.out.println(T);
		
		double M = calculator.divide(10, 2);
		System.out.println(M);
		
		calculator.powerOff();
		
		// 가변길이 매소드에 값을 줄때 모든 값이 매개변수 타입에 맞아야 한다.
		// 매개변수 3개 , 5개
		// 만약 메소드의 매개 변수가 배열이면 아래 코드는 컴파일 에러가 난다.
		int num1 = calculator.sum(1,2,3);
		int num2 = calculator.sum(1,2,3,4,5);		

		// 가변 길이의 매소드에 위처럼 값을 넣어도 되지만 
		// 이런식으로 타입에 맞는 배열을 생성해 주어도 된다.
		int[] arr = {1,2,3};
		int num3 = calculator.sum(arr);
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		// 메소드 오버로딩으로 인해 메소드 명은 같지만 각각에 맞는 메소드가 실행된다.
		double aw1 = calculator.area_a_square(10);
		double aw2 = calculator.area_a_square(12.5,13.2);
		System.out.println(aw1 + " " + aw2);
		
		
		// 실행에는 문제는 없지만 클래스 명으로 정적 맴버에 접근하는것이 정석이다.
		// 정적 맴버를 참조변수로 접근하면 경고표시를 낸다 .
		// static 키워드를 이용해 객체 생성 없이 클래스의 메소드와 필드값을 사용할수 있다.
		double aw3 = 10 * 10 * Calculator.pi;
		int aw4 = Calculator.Plus(5, 8);
		int aw5 = Calculator.Minus(8, 5);
		
		// 값 변경도 가능하다.
		Calculator.pi = 42.23;
		
		System.out.println(Calculator.inof);
		
		
	}
}
