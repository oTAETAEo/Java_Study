package ch09.sec02;

public class A {
	
	// 클래스 안에 선언 됭수 있는것.
	// Field
	int field1;
	B field2;
	
	// Constructor
	A(){
		B b = new B();
		b.methotB();
	}
	
	// Method
	
	void methotA() {
		B b = new B();
		b.methotB();	
	}
	
	// Nested Class
	// B 클래스도 인스턴스클래스이기 때문에 객체 A가 없다면 생성할수 없다.
	class B{
		
		void methotB() {
			System.out.println("methotB() 실행");
		}
	}
	
}
