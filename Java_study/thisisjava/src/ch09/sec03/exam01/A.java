package ch09.sec03.exam01;

public class A {

	// 중첩 클래스
	static class B{
	
		void methotB() {
			System.out.println("methotB() 실행");
		}
		
	}
	
	// 필드 
	B field1 = new B();
	// A객체 없이도 사용가능.
	static B field2 = new B();

	A(){
		B field1 = new B();
	}
	
	void methot1() {
		B field1 = new B();
	}
	
	static void methot2() {
		B field1 = new B();
	}
	
	
}
