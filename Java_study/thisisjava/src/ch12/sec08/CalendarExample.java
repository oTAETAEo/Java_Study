package ch12.sec08;

import java.util.Calendar;

public class CalendarExample {

	public static void main(String[] args) {
		
		// 컴퓨터에 설정 되어있는 시간대를 기준으로 객체를 얻을수 있다.
		// 컴퓨터에 있는 시간을 가져온다.
		
		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MARCH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int week = calendar.get(Calendar.DAY_OF_WEEK);
		
		String strWeek = null;
		switch (week) {
			case Calendar.MONDAY:  strWeek = "월"; break;
			case Calendar.TUESDAY:  strWeek = "화"; break;	
			case Calendar.WEDNESDAY:  strWeek = "수"; break;	
			case Calendar.THURSDAY:  strWeek = "목"; break;	
			case Calendar.FRIDAY:  strWeek = "금"; break;	
			case Calendar.SATURDAY:  strWeek = "토"; break;	
			default: strWeek = "일"; break;	
		}
		
		int amPm = calendar.get(Calendar.AM_PM);
		String strAmPM = null;
		if(amPm == Calendar.AM){
			strAmPM = "오전";
		} else {
			strAmPM = "오후";
		}
		
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일 ");
		
		System.out.print(strWeek + "요일 ");
		System.out.println(strAmPM + " ");

		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초 ");

		
		
	}
}
