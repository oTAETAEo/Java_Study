package ch11.sec02.exam02;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		// 빨간줄이 나오는데 마우스를 올리면 발생할수 있는 예외가 나온다.
		// ClassNotFoundException
//		Class.forName("java.lang.String");
		
		try {
			// 이 클래스가 있다면 바이트 코드에 저장하는 메소드
			Class.forName("java.lang.String");
			System.out.println("주어진 클래스가 있습니다");
		} catch (ClassNotFoundException e) {
			System.out.println("주어진 클래스는 없습니다");
		}
		
		System.out.println();
		
		try {
			// 이 클래스가 있다면 바이트 코드에 저장하는 메소드
			Class.forName("java.lang.String2");
			System.out.println("주어진 클래스가 있습니다");
		} catch (ClassNotFoundException e) {
			System.out.println("주어진 클래스는 없습니다");
			// 예외 발생 위치 알려준다.
			e.printStackTrace();
		}
		
		
	}

}
