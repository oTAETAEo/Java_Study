package ch09.sec03.exam02;

public class A {

	// 정적 맴버 클래스
	static class B{
		
		// 인스턴스 필드
		int field1 = 1;
		
		// 정적 필드 JAVA17부터 허용
		static int field2 = 2;
		
		// 생성자
		B(){
			System.out.println("B-생성자 실행");
		}
		
		// 인스턴스 매소드
		void method1() {
			System.out.println("B-method1() 실행");
		}
		
		// 정적 매소드
		static void methot2() {
			System.out.println("B-method2() 실행");
		}
	}
}
