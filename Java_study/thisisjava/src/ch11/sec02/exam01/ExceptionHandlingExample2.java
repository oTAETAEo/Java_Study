package ch11.sec02.exam01;

public class ExceptionHandlingExample2 {

	public static void printLength(String data) {
		
		// 예외 처리 하는법.
		// try 실행 코드 작성.
		// catch 실행 코드에서 예외가 발생하면 실행
		// finally 무조껀 실행.
		try {
			int result = data.length();
			System.out.println("문자수 :" + result);			
		// 어떤 예외를 잡을지 위에 매개변수를 넣어준다.
		} catch (NullPointerException e) {
			// 예외 메시지 보여주는 메소드.
			// 위에서 아래까지 예외 출력 문이 자세히 출력 된다.
			// 모두 예외 이유 출력문.
//			System.out.println(e.getMessage());
//			System.out.println(e.toString());
			//이 코드 많이 사용.
			e.printStackTrace();
		} catch (Exception e) {
			// 다른 에러가 발생할수 있다면 여러개 작성가능하다.
			
		}finally {
			System.out.println("[마무리 실행]\n");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");
		
		printLength(null);
		System.out.println("[프로그램 종료]");

	}
}

//일반 예외(Exception) -> 컴파일러가 잡아주는 예외이다 코드를 작성 할때 빨간줄로 잡아준다.
//실행 예외(Runtime Exception) -> 컴파일러가 잡아주지 못해 파일을 실행 시켰을 경우 발생하는 오류이다.
//자바는 예외가 발생하면 예외 클래스로부터 객체를 생성하고 이 객체는 예외 처리시에 사용이 된다.
//자바의 모든 에러와 예외 클래스는 Throwable을 상속받아 만들어진다.
//추가적으로 예외 클래스는 java.lang,Exception 클래스를 상속받아 만들어진다.
//실행 예외는 Runtime Exception과 그자식 클래스에 해당한다.