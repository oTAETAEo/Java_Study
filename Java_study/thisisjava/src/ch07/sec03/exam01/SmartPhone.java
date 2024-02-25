package ch07.sec03.exam01;

// 상속 키워드 extends 
public class SmartPhone extends Phone{
	
	// 앞에서 부모 객체가 먼저 생성되고 그 후 자식 객체가 생성된다고 맣 했는데 부모 객체의
	// 생성자는 super(); 이라는 메소드가 숨겨져 있어 부모객체를 호출해준다.
	
	// 셍성자 선언
	public SmartPhone(String model, String colar) {
		// 생략 가능.
		super();
		this.model = model;
		this.color = colar;
		System.out.println("SmartPhone(String model, String colar) 생성자 실행");
	}
	
}
