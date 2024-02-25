package ch09.sec06.exam01;

public class Main {

	public static void main(String[] args) {
		
		// 버튼 객채 생성.
		Button btnOk = new Button();
		Button btnCancel = new Button();
		
		// 버튼 클릭 이벤트 처리 객체.
		// Button.ClickListener 인터페이스를 오버라이딩한다.
		// 인터페이스는 정적으로 선언 되어있기 때문에 클래스.인터페이스로 바로 접근 가능하다.
		class OkListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("OK 버튼이 실행되었습니다.");
			}
		}
		
		// 이벤트 처리 객체.
		class CancelListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼이 실행되었습니다.");
			}
		}
		
		btnOk.setClickListener(new OkListener());
		btnOk.click();
		
		
		btnCancel.setClickListener(new CancelListener());
		btnCancel.click();
	}

}
