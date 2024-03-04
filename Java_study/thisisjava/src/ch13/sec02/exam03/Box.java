package ch13.sec02.exam03;

public class Box<T>{

	public T content;
	
	// Box의 내용물이 같은지 확인.
	public boolean compare(Box<T> bex) {
		// content.equals는 아직 타입이 정해지지 않아 Object타입의 equals가
		// 실행되지만 T에 들어오는 클래스에 equals가 재정의 되어 있다면 재정의된
		// equals가 실행된다. 예) String의 equals는 객체의 주소가 아닌 문자열이
		// 같은지 비교를 한다.
		
		boolean b = content.equals(bex.content);
		return b;
	}
}
