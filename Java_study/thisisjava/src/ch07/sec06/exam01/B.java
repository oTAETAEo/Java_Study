package ch07.sec06.exam01;

public class B {
	
	// 같은 패키지라 객체 생성과 필드 메소드에 접근이 가능하다.
	public void methot() {
		A a = new A();
		a.fleld = "volue";
		a.methot();
	}
}
