package ch08.sec02;

// interface는 public과 default 공개범위를 설정할수 있다.
public interface RemoteControl {
	
	// public 추상 메소드를 선언 둘 다 같지만 안붙히는 것이 관례.
	// 인터페이스는 public 공개 범위를 설정하지 않아도 자동으로 public이다.
//	void turnOn(); 도 public이다.
	
	// 추상 선언 키워드 abstract 생략 해도 abstract이다.
	// 공개 한다는 public 키워드 생략해도 public이다.
//	public abstract void turnOn();
	public void turnOn();

}
