package ch09.sec06.exam02;

public class Button {
	
	// 인터페이스 변수 선언.
	private LanguageseButton languageseButton;

	// 중첩 인터페이스.
	public static interface LanguageseButton{
		public void button();
	}
	
	// Setter
	public void setLanguageseButton(LanguageseButton languageseButton) {
		this.languageseButton = languageseButton;
	}
	
	public void click() {
		languageseButton.button();
	}
}
