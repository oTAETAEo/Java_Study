package ch09.sec03.exam02;

public class Main {

	public static void main(String[] args) {
		
		// 인스턴스 클래스인 A 안에 선언되어 있는 B 정적 클래스.
		// 아래처럼 객체 생성 가능하다.
		A.B b = new A.B();

		// B객체의 인스턴스 필드, 매소드 실행.
		System.out.println(b.field1);
		b.method1();
		
		// A에 선언된 정적 클래스인 B의 정적 필드, 매소드 실행.
		// 클래스로 접근해 실행한다.
		System.out.println(A.B.field2);
		A.B.methot2();
	}

}
