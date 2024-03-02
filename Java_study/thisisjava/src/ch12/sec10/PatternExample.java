package ch12.sec10;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		
		// Pattern 클래스로 문자열이 정확히 입력 되었는지 검증할수 있다.
		// 정규 표현식을 사용한다.
		String data = "010-6542-4114";
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		boolean b = Pattern.matches(regExp, data);
		
		if(b) {
			System.out.println("정확히 입력 했습니다");
		}else {
			System.out.println("다시 입력하시오.");
		}
		
		data = "cjdk@navew.com";
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		b = Pattern.matches(regExp, data);
		
		if(b) {
			System.out.println("정확히 입력 했습니다");
		}else {
			System.out.println("다시 입력하시오.");
		}
	}

}
