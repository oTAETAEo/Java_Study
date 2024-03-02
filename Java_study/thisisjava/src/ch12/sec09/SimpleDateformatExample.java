package ch12.sec09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateformatExample {

	public static void main(String[] args) {
		
		// 날짜를 표현하는 클래스로 객체간의 날짜정보를 주고 받을때 사용된다.
		Date now = new Date();
		
		// SimpleDateFormat은 날짜를 형식화된 문자열로 변환하는 기능을 제공한다.
		SimpleDateFormat format = new SimpleDateFormat("yyyy년MM월dd일");
		System.out.println(format.format(now));
		
		format = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(format.format(now));
		
		 
	}
}
