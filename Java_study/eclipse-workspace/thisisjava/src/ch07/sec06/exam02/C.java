package ch07.sec06.exam02;

import ch07.sec06.exam01.A;

public class C {

	// import를 했음에도 불구하고 에러가 난다 이유는 
	// A 클래스는 공개 클래스 이지만 생성자의 접근 제한자가 protected 이기 떄문애
	// 상속을 받지 않는다면 아래 코드는 실행이 되지 않는다.
	public void methot() {
//		A a = new A();
//		a.fieldl = "volue"
//		a.method1();
	}
	
}
