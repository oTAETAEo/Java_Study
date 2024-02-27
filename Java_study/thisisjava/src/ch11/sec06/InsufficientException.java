package ch11.sec06;

// 일반 예외가 된다.
public class InsufficientException extends Exception{

// 생성자 
	public InsufficientException() {

	}
	
	// 예외의 이유를 받아 상위 예외 클래스에 넘겨준다.
	public InsufficientException(String message) {
		super(message);
	}
}
