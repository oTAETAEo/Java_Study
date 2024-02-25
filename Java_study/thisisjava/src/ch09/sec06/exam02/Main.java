package ch09.sec06.exam02;

public class Main {

	public static void main(String[] args) {
		
		Button javaButton = new Button();
		Button cButton = new Button();
		
		javaButton.setLanguageseButton(new Java());
		javaButton.click();
		
		cButton.setLanguageseButton(new C());
		cButton.click();
	}

}
