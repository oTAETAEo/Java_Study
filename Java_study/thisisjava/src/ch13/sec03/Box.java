package ch13.sec03;

public class Box<T> {

	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	// 인스턴스 메소드여도 매개값을 다른 객체로 주면 그 객체의 클래스가 실행이 된다.
	public <T> void print(T t) {
		System.out.println(t);
	}
}
