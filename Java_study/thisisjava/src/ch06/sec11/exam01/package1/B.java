package ch06.sec11.exam01.package1;

public class B {
	
	A a1 = new A(true);
	A a2 = new A(1);
	
	// private 으로 지정된 생성자이기 때문에 사용 불가하다.
//	A a3 = new A("문자열");
	
	public void method() {
		
		A a = new A(1);
		
		// 메소드를 호출하기 위해 자동완성 기능을 사용하는데 초록색은 public 파란색은 지정이 되있지 않은 범위이다. 
		a.fieldl1 = 1;
		a.fieldl2 = 1;
		// 이 필드는 보이지 않는다 a 클래스에서 fieldl3의 공개범위는 private이기 때문이다.
//		a.fieldl3
		
		a.method1();
		a.method2();
		// 이 메소드는 보이지 않는다 a 클래스에서 method3의 공개범위는 private이기 때문이다.
//		a.method3();
		
	}
	
	
}
