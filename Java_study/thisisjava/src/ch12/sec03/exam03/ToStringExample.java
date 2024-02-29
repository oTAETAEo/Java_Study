package ch12.sec03.exam03;

public class ToStringExample {

	public static void main(String[] args) {
		
		SmartPhone phone = new SmartPhone("삼성전자", "안드로이드");
		
		// toString을 재정의 하지 않으면 클래스명@16진수해시코드가 출력이 된다.
		// 객체의 정보가 중요하다면 간결하고 유익한 정보를 리턴 하도록 재정의 한다.
		
		String str = phone.toString();
		System.out.println(str);
		
		// 객체만 넣으면 자동으로 toString이 호출된다.
		System.out.println(phone);
	}

}
