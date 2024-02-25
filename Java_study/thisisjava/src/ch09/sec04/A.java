package ch09.sec04;

public class A {

	public void method1(int arg) {
		
		// 로컬 변수 , 매소드의 매개변수도 로컬 변수이다.
		int var = 1;
		
		class B{
			// 로컬 변수를 로컬 클래스에서 사용할경우 final특성을 가진다.
			void method2() {
				System.out.println(arg);
				System.out.println(var);
			}
		}
		
		// 로컬 클래스에서 로컬변수를 출력하는 코드가 있기 떄문에 사용할수 없다.
//		arg = 2;
//		var = 2;
	
		System.out.println(arg);
		System.out.println(var);

	}
	
	public static void main(String[] args) {
		A a = new A();
		a.method1(3);
	}
}
