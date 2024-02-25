package ch07.sec06.exam02;

// 다른 페키지에 있는 클래스는 import를 통해 가져온다. 
import ch07.sec06.exam01.A;

// A클래드를 가져와서 상속을 받았기 때문에 아래 코드가 가능하다.
public class D extends A {

	// 생성자 선언.
	// 상속을 통해서 가능하다.
	public D() {
		// A 클래스 생성자 호출.
		super();
	}
	
	// 메소드 선언.
	private void method1() {
		this.fleld = "value";
		this.methot();
	}
	
	// 직접 생성해서 사용하는 방법은 불가하다.
	public void method2() {
//		A a = new A();
//	    a.fieldl = "volue"
//		a.method1();
	}

}
