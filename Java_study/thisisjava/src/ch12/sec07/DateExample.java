package ch12.sec07;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		
		// 코드가 실행될때의 날짜및 시간 저장.
		Date now = new Date();
		System.out.println(now);	
		
		// 보기 쉽게 만들어주는 클래스. 사용방법은 도큐먼트 참고.
		SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String str = format.format(now);
		System.out.println(str);
			
		
	}

}
