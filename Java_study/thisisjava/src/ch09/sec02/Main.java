package ch09.sec02;

public class Main {

	public static void main(String[] args) {
		
		
		// 인스턴스 맴버안에 있는 인스턴스 맴버 클래스이기 때문에 A의 객체를 선언해 주고
		// B의 객체를 선언해주어야 한다.
		A a = new A();
		A.B b = a.new B();
		
		b.methotB();
	}

}
