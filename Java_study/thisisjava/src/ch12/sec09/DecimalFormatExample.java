package ch12.sec09;

import java.text.DecimalFormat;

public class DecimalFormatExample {

	public static void main(String[] args) {
		
		double d = 12345.89;
		
		// DecimalFormat 클래스는 숫자를 형식화된 문자열로 변환하는 기능을 제공한다.
		// 소괄호에 기호로 패턴을 만들어서 사용.
		DecimalFormat df = new DecimalFormat("#,###");
		
		System.out.println(df.format(d));
	}

}
