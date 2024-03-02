package ch11.sec05;

public class ThrowsExample {

	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 이 메소드 안에서 발생할수 있는 예외가 여러개라면 throws에 , 로 발생할수 있는 예외 클래스를 적어준다.
	public static void findClass() throws ClassNotFoundException{
		// 괄호 안에 있는 클래스명 파일을 찾아라.
		// 없으면 예외 발생.
		// 이 메소드를 실행한 곳으로 가서 예외 처리를 한다.
		Class.forName("java,lang.String2");
	}
}
