package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {

	public static void printLength(String data) {
		
		// 매개값을 null을 주면 오류가 나게 된다.
		int result = data.length();
		System.out.println("문자수 :" + result);
	}
	
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작\n");
		printLength("ThisIsJava");
		
		// 컴파일 하기 전까지는 오류인지 알수 없다 (실행 예외)
		printLength(null);
		System.out.println("프로그램 종료");

	}
}

