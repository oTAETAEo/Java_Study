package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataTimeOperationExample {

	public static void main(String[] args) {
		
		// 현재 컴퓨터 시간 객체 생성
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter def = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		
		System.out.println("현재 시간: " + now.format(def));
		
		LocalDateTime result1 = now.plusYears(1);
		System.out.println("1년 덧셈: " + result1.format(def));
		
		LocalDateTime result2 = now.minusMonths(2);
		System.out.println("2월 빼기: " + result2.format(def));
		
		LocalDateTime result3 = now.plusDays(7);
		System.out.println("7일 덧셈: " + result3.format(def));
	}

}
