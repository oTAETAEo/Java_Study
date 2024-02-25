package ch06.sec11.exam01.package1;

// class를 생성할때 package를 클릭하면 public이 붙지 않는다.
public class A {
	
	// 필드선언 
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");

	// 생성자 선언 
	
	// 접근 제한자를 쓰는 이유는 캡슐화 이고 무결성을 잃지 않기 위해 사용한다.
	// 결함이 없눈 성질을 말한다..
	// 접근 제한자의 종류 public > 지정 x > private
	
	// 공개 생성자.
	public A(boolean b) {}
	
	// 같은 패키지에서만 사용가능.
	A (int i) {}
	
	// 클래스 안에서만 사용가능.
	private A (String s) {}
	

	// 공개 지정자를 지정한 필드 생성.
	public int fieldl1;
	int fieldl2;
	private int fieldl3;
	
	// 공개 지정자를 지정한 매소드 생성.
	public void method1() {}
	void method2() {}
	private void method3() {}
	
}
