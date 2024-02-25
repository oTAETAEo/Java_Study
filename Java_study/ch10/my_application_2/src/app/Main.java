package app;

import pack1.A;
//import pack2.B;
import pack3.C;

public class Main {

	public static void main(String[] args) {
		
		A a = new A();
		a.method();
		
		// 패키지가 은닉 처리가 되면 사용할수 없다.
//		B b = new B();
//		b.method();
		
		C c2 = a.getC();
		c2.method();
		
		
	}

}
