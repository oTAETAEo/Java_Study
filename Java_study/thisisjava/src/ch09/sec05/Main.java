package ch09.sec05;


public class Main {

	public static void main(String[] args) {
		
		A a = new A();
		a.useB();
		
		// 인스턴스 필드 안에 있는 인스턴스 클래스 호출.
		A.B a2 = a.new B();
		
		
	}

}
