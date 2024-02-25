package ch07.sec05;

// A와 다르게 final 클래스가 아니기 때문에 상속을 받을수 있다.
public class C extends B{

	// final로 선언되지 않은 매소드는 오버라이딩이 가능하지만.
	// methot2 같은경우 final로 선언 되어 있어서 오버라이딩이 불가능 하다.
	@Override
	public void methot1() {
		
	}
	
}
