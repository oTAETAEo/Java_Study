package ch08.sec03;

public class Main {

	public static void main(String[] args) {
		
		// 인터페이스에 선언된 정적 필드이기 때문에 바로 접근해서 사용가능. 
		// 구현 객체 안에서 대부분 사용한다.
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);

		
	}

}
