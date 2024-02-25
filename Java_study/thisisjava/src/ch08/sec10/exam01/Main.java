package ch08.sec10.exam01;

public class Main {

	public static void main(String[] args) {
		
		// A는 인터페이스이다
		// A를 인터페이스로 가지는 클래스는 B,D이다.
		// C는 B를 부모로 가지는 클래스이다.
		// E는 D를 부모로 가지는 클래스이다.
		
		// A를 인터페이스로 가지는 클래스를 상속 받게 되면
		// 자식 클래스도 A인터페이스를 사용할수 있다.
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		A Interface;
		
		Interface = b;
		Interface = c;
		Interface = d;
		Interface = e;
	}

}
