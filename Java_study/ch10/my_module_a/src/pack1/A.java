package pack1;

import pack2.B;
import pack3.C;

public class A {
	
	public void method() {
		System.out.println("A-method 실행");
		
		B b = new B();
		b.method();
	}
	
	// 모듈 기술자에서 transitive 를 사용해 전이를 했기 때문에 사용 가능하다.
	public C getC() {
		C c = new C();
		return c;
	}
}
