package ch05.sec12;

import java.util.Calendar;

public class Week_Exp {

	public static void main(String[] args) {
		
		// 열거 타입 변수를 선언.
		// 참조타입이다.
		Week today = null;
		
		// 열거값 대입
		today = Week.THURSDAY;
		
		// 열거값 비교
		if(today == Week.FRIDAY) {
			System.out.println("오늘은 금요일.");
		}
		else {
			System.out.println("오늘은 금요일이 아닙니다");
		}
		
		// 컴퓨터의 요일 정보 얻기
		// 자세한건 ch10
		Calendar now = Calendar.getInstance();
		int day = now.get(Calendar.DAY_OF_WEEK);
		
		switch (day) {
		case 1: today = Week.SUNDAY;
		case 2: today = Week.MONDAY;
		case 3: today = Week.TUESDAY;
		case 4: today = Week.WEDNEDAY;
		case 5: today = Week.THURSDAY;
		case 6: today = Week.FRIDAY;
		case 7: today = Week.SUNDAY;
		}
		
		if(today == Week.FRIDAY) {
			System.out.println("오늘은 금요일.");
		}
		else {
			System.out.println("오늘은 금요일이 아닙니다");
		}
	}

}
