package ch07.sec06.exam01;

public class A {
	
	// protected 접근 제한자는 class에는 사용하지 못하고 필드,메소드,생성자에만 사용한다.
	// 접근 범위는 같은 패키지라면 마음껏 사용할수 있지만 다른 패키지면 
	// 자식 클래스에서만 사용가능하다 (인스턴스 필드라 객체 선언 후 사용가능).
	// public > protected >	Default > private 순이다.
	
	
	// protected 필드, 생성자, 매소드 선언.
	protected String fleld;
	
	protected A() {
	}
	
	protected void methot() {
		
	}
	
}

