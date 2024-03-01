package ch12.sec04;

public class ErrExample {

	public static void main(String[] args) {
		
		try {
			
			String str = "1oo";
			int num = Integer.parseInt(str);  
			
		} catch (NumberFormatException e) {
			
			// 에러가 발생하면 콘솔창에 빨간 글씨로 오류 내용이 출력된다.
			System.err.println("[오류발생]");
			System.err.println(e.toString());
		}
	}

}
