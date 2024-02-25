package ch06.sec15;

public class Singleton {

	// 하나의 객체만 같는다 main에서 만들어진 모든 Singleton 변수는 같은 객체를 가리킨다.
	// private 접근 권한을 가진 정적 객체 생성후 초기화. 
	private static Singleton singleton = new Singleton();
	
	// private 접근권한을 가진 생성자.
	private Singleton() {
	}
	
	// 만들어진 객체의 주소를 가진 singleton 리턴.
	static Singleton gerInstance() {
		return singleton;
	}
	
}
