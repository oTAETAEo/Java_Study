package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		// 구분자가 2개 이상이면 String 메소드인 split를 사용해야한다.
		
		String data1 = "홍길동&김수연,김민재";
		String[] arr = data1.split("&|,");
		
		for(String token: arr) {
			System.out.println(token);
		}
		
		System.out.println();
		
		// 구분자가 1개라면 위 아래 둘다 사용 가능하다.
		// 차이점은 split는 정규 표현식으로 구분하고 StringTokenizer는 문자로 구분을 한다는 점이다.
		
		String data2 = "홍길동,김수연,김민재";
		StringTokenizer tokenizer = new StringTokenizer(data2,",");
		
		// 구분한 문자열이 남아 있는지.
		while(tokenizer.hasMoreTokens()) {
			// 구분한 문자열을 가져온다.
			String str = tokenizer.nextToken();
			System.out.println(str);
		}
		
	}

}
