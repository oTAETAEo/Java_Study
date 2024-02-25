package ch07.sec10;

public class Dog extends Animal{

	// 추상 클래스를 상속해서 사용하는경우 추상 메소드가 있다면 반드시 오버라이딩을 해주어야 한다.
	
	// 상위 클래스의 생성자 호출 
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
}
