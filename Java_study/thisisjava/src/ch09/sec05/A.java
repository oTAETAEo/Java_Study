package ch09.sec05;

public class A {

	// A 클래스의 필드와 메소드.
	String field = "A-field";
	
	void method() {
		System.out.println("A-method");
	}
	
	// 인스턴스 클래스안에 중첩된 인스턴스 맴버 클래스는 바깥클래스의 모든 메소드와 필드에 접근 가능.
	// 정적 맴버 클래스는 바깥클래스의 정적 핃드와 메소드만 접근 가능하다.
	// 객체를 생성해서 접근 해야하나 하지 않고도 접근 할수있냐의 차이.
	class B{
		
		// B 클래스의 인스턴스 필드, 메소드
		String field = "B-field";
		
		void method() {
			System.out.println("B-method");
		}
		
		void print() {
			System.out.println(this.field);
			this.method();
			
			System.out.println(A.this.field);
			A.this.method();
		}
	}
	
	void useB() {
		B b = new B();
		b.print();
	}
	
}
