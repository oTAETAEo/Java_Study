package ch06.sec11.exam01.package2;

import ch06.sec11.exam01.package1.*;

public class C {
	
	// 필드선언 
	A a1 = new A(true);
	
	// 아래 두 코드의 생성자의 접근 제한자가 public 이 아닌 private,접근 제한자가 지정되지 않아서
	// 에러가 뜬다.
	
//	A a2 = new A(1);
//	A a3 = new A("문자열");
	
	public C() {
		A a = new A(true);
		
		// 메소드를 호출하기 위해 자동완성 기능을 사용하는데 초록색은 public 파란색은 지정이 되있지 않은 범위이다. 
		a.fieldl1 = 1;
		// 이 필드는 보이지 않는다 a 클래스에서 fieldl2,fieldl3의 공개범위는 범위 설정 x, private이기 때문이다.
//		a.fieldl2 = 1;
//		a.fieldl3
				
		a.method1();
		// 이 메소드는 보이지 않는다 a 클래스에서 method2은 method3의 공개범위는 범위 설정 x, private이기 때문이다.
//		a.method2();
//		a.method3();
		
	}
}
