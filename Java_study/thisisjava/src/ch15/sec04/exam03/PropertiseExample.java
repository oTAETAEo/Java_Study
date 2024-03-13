package ch15.sec04.exam03;

import java.io.IOException;
import java.util.Properties;

public class PropertiseExample {

	public static void main(String[] args) {
		
		// Hashtable을 상속 받았기 때문에 특징을 그대로 가지고 있다. (동기화)
		// String,String 값이기 때문에 이렇게 생성한다.
		Properties properties = new Properties();
		
		// 이 예외가 발생할수 있다.
		// IOException- 입력 스트림에서 읽을 때 오류가 발생한 경우.
		// IllegalArgumentException- 입력 스트림에 잘못된 유니코드 이스케이프 시퀀스가 ​​포함된 경우.
		// NullPointerException- inStreamnull 인 경우
		
		try {
			properties.load(PropertiseExample.class.getResourceAsStream("database.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String admin = properties.getProperty("admin");
		
		// database.properties 파일에는 "키 = 값" 으로 저장이 된다.
		// 한글은 유니코드 형식으로 저장해야 한다.
		System.out.println(driver);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		System.out.println(admin);
		
		
	}

}
