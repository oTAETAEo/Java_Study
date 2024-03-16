package ch16.sec02.exam02;

public class ButtonExample {

	public static void main(String[] args) {
		
		Button button = new Button();
		
		// setClickListener의 메소드는 람다식을 매개변수로 받는다.
		button.setClickListener(()->{
			System.out.println("OK 버튼을 클릭했습니다.");
		});
		
		button.click();
		
		Button button2 = new Button();
		
		button2.setClickListener(()->{
			System.out.println("Cancel 버튼을 클릭했습니다.");
		});
		
		button2.click();
	
	}

}
