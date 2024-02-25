package ch08.sec07;

public interface Service {

	// 인터페이스에는 default 메소드가 올수 있다 이것은 인터페이스를 이용해 사용하는 객체에서
	// 동일한 행동을 하는것 예를 들면 티비를 끄는행동 컴퓨터를 끄는 행동을 각각의 객체에 저장하면
	// 코드가 길어지기 때문에 객체간의 동일한 동작을 하는 메소드를 default로 지정해 선언한다
	// default 메소드는 각각의 객체에서 인터페이스에서 선언된 사용방법이 맞다면 상관 없지만
	// 만약 사용 방법이 맞지 않다면 맞게 또 재정의를 할수 있다.
	// default 메소드는 이 인터페이스를 사용하는 객체가 있어야지만 사용 할수있는 메소드이다.
	
	default void defaultMethpt1() {
		defaultMethptOverlap();
		System.out.println("defaultMethpt1() 코드");
	}
	default void defaultMethpt2() {
		defaultMethptOverlap();
		System.out.println("defaultMethpt2() 코드");
	}
	
	// private 메소드를 사용하는 경우는 메소드를 작성하는데 서로 중복되는 코드가 있는 메소드에
	// 둘다 중복코드를 작성하면 코드가 길어지니까 중복코드를 메소드로 만들어 사용하기 위해 사용한다.
	// 예를 들어 100줄 중에 99줄이 같고 1줄만 다른 메소드라면 99줄을 private메소드로 만드는 것
	private void defaultMethptOverlap() {
		System.out.println("defaultMethpt1,2 중복 코드");
	}
	
	
	// 인터페이스에는 static 인 정적 메소드가 올수 있다 이것은 예를 들면 티비와 관계가 없는 헹동은
	// 배터리를 교환 하는것이다 이런 인터페이스 만의 개인적인 행동을 static으로 선언한다.
	// static 메소드는 이 인터페이스르 ㄹ사용하는 객체가 없어도 사용이 가능한 정적 매소드이다.
	
	public static void staticMethot1() {
		staticMethotOverlap();
		System.out.println("staticMethot1() 코드");
	}
	public static void staticMethot2() {
		staticMethotOverlap();
		System.out.println("staticMethot2() 코드");
	}
	
	// private 메소드를 사용하는 경우는 메소드를 작성하는데 서로 중복되는 코드가 있는 메소드에
	// 둘다 중복코드를 작성하면 코드가 길어지니까 중복코드를 메소드로 만들어 사용하기 위해 사용한다.
	// 예를 들어 100줄 중에 99줄이 같고 1줄만 다른 메소드라면 99줄을 private메소드로 만드는 것
	private static void staticMethotOverlap() {
		System.out.println("staticMethot1,2 중복 코드");
	}
}
