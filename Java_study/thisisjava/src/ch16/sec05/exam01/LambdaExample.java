package ch16.sec05.exam01;

public class LambdaExample {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		// 클래스의 정적 매소드 참조
		// 모두 같은 결과를 반환.
		person.action((x, y) -> {
			return Computer.staticMethod(x, y);
		});
		
		person.action((x, y) -> Computer.staticMethod(x, y));
		
		person.action(Computer :: staticMethod);
	
		// 인스턴스 클래스의 메소드 참조.
		// 클래스 참조 변수를 사용한다.
		Computer computer = new Computer();
				
		person.action((x, y) -> computer.instanceMethod(x, y));
		person.action(computer :: instanceMethod);
		
		
		
	}
}
