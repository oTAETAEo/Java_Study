package ch12.sec08;

import java.util.Calendar;
import java.util.TimeZone;

public class LosAngelesExample {

	public static void main(String[] args) {
		
		// America/Los_Angeles 아이디를 가져온다.
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar calendar = Calendar.getInstance(timeZone);
		
		int amPm = calendar.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hore = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		System.out.println("America/Los_Angeles Time");
		System.out.print(strAmPm + " ");
		System.out.print(hore + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초 ");

		// 나라/지역 id를 보여준다.
		String[] str = TimeZone.getAvailableIDs();
		for(String a : str) {
			System.out.println(a);
		}
 		
	}

}
