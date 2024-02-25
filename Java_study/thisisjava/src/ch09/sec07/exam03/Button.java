package ch09.sec07.exam03;

public class Button {
	// Field
	// 인터페이스 변수 생성.
	private ClickListener clickListener;
	
	// Constructor
	
	// Method
	// (Setter)
	// 다형성 이용해 ClickListener 인터페이스로 만들어진 클래스 객체가 올수 있다.
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	public void click() {
		clickListener.onClick();
	}
	
	// Nested Class
	
	// Nested Interface
	// 중첩 인터페이스.
	public static interface ClickListener{
		public void onClick();
	}
	
}
