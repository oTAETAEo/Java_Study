package ch02.sec13;

// 입력을 위한 클래스를 사용하기 위한 외부 파일 import (c++에서는 #include)
// 한번에 입력 하기 위한 단축기 (컨트롤 + 시프트 + o)
// 변수 타입에 빨간줄이 있으면 한번 눌러보자.
// 코딩 테스트할때 사용 된다고 함.
import java.util.Scanner;

public class Scanner_Exp {

	public static void main(String[] args) {
		
		// Scanner 객체를 생성수 매개변수는 현재 컴퓨터에서 입력창치를 준다 (System.in)
		Scanner scanner = new Scanner(System.in);

		System.out.println("x 값 입력: ");
		
		// 엔터 누르기 전까지의 입력을 받는다.
		String strX = scanner.nextLine();
		
		// 입력 받은 문자열을 int로 변환.
		int x = Integer.parseInt(strX);
		
		// 동일
		System.out.println("y값 입력: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int T = x+y;
		System.out.println("x + y = " + T);
		
		// 루프를 이용한 문자열 입력.
		while(true) {
			System.out.println("입력 문자열 ");
			String data = scanner.nextLine();
			System.out.println(data);
			
			// 문자열 메소드인 equals()은 문자열을 메개변수로 받아 bool값을 리턴.
			if(data.equals("q")) {
				break;
			}
		}
		
	}

}
