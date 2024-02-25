package ch07.sec10;

// 추상 클래스 선언 : 공개범위 abstract class 클래스명{}
// 상속은 가능하고 객체 생성은 불가능하다.
public abstract class Animal {

	public String name;
	
	// 생성자
	public Animal(String name) {
		this.name = name;
	}
	
	// 일반 메소드
	public void breath() {
		System.out.println("숨을 쉰다");
	}
	
	// 추상 메소드 abstract (애브스트랙트)
	public abstract void sound();
	
}
