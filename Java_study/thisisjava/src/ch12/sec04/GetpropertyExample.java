package ch12.sec04;

import java.util.Properties;
import java.util.Set;

public class GetpropertyExample {

	public static void main(String[] args) {
		
		// 운영체제, 사용자 이름, 사용자 홈 디랙토리 경로를 가져온다.
		// 소괄호에 키 값이 들어가게 된다.
		String osNema = System.getProperty("os.name");
		String userNema = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");
		
		System.out.println(osNema);
		System.out.println(userNema);
		System.out.println(userHome);

		System.out.println("-----------------------");
		System.out.println("key: value");
		System.out.println("-----------------------");
		// 객체를 가져온다.
		Properties props = System.getProperties();
		Set keys = props.keySet(); 
		
		for(Object objKey : keys) {
			String key = (String) objKey;
			String value = System.getProperty(key);
			System.out.printf("%-40s: %s\n",key ,value);
		}
	}

}
