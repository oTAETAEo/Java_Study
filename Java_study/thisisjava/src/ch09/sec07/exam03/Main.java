package ch09.sec07.exam03;

public class Main {

	public static void main(String[] args) {
		
		// 버튼 객채 생성.
		Button btnOk = new Button();
		Button btnCancel = new Button();
		
		// 바로 익명 구현 객체를 만들어서 대입해준다.
		btnOk.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("OK 버튼이 실행되었습니다.");
			}
		});
		btnCancel.setClickListener(new Button.ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼이 실행되었습니다.");
				
			}
		});
		
		btnOk.click();
		btnCancel.click();
	}

}
