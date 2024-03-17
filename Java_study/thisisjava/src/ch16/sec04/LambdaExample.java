package ch16.sec04;

public class LambdaExample {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.action((x, y) -> {
			double result = x + y;
			return result;
		});
		
		// return 문 하나면 return을 생략하고 값을 리턴할수 있다.
		person.action((x, y) -> x + y);
		
		// 메소드 호출 코드가 하나의 같은 타입의 값을 리턴 하는 경우 사용할수 있다.
		person.action((x, y) -> {
			return sum(x,y);
		});
		
	}
	
	public static double sum(double x, double y) {
		return (x+y);
	}

}
