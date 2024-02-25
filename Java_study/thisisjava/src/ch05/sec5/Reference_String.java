package ch05.sec5;

public class Reference_String {

	public static void main(String[] args) {
		
		// 홍길동을 name1, name2가 가리킨다.
//		String name1 = "홍길동";
//		String name2 = "홍길동";

		// new 키워드로 String 객체를 생성해 name1에 저장
		// new 키워드로 String 객체를 생성해 name2에 저장
		// 따로 따로 만들어진다.
//		String name1 = new String("홍길동");
//		String name2 = new String("홍길동");
		
// ------------------------------------------------------------
		
//		String name1 = "홍길동";
//		String name2 = "홍길동";
//		String name3 = new String("홍길동");
		
		// name1,name2는 동일한 문자열 리터널로 생성 되었기 때문에 true
		// name2,name3는 리터널 생성, new 키워드 생성이기 때문에 서로 다른 객체 false
//		System.out.println(name1 == name2);
//		System.out.println(name2 == name3);
				
		// 문자열 메소드인 equals()는 객체 안에 있는 문자열이 같은지 비교하는 것이다.
		// 위에 코드와 다르게 두 문장 다 ture가 나오는것을 볼수 있다.
//		System.out.println(name1.equals(name2));
//		System.out.println(name2.equals(name3));
				
// ------------------------------------------------------------

		// 문자열이 같은지 (대소문자 구분)
//		boolean result = str1.equale(str2);
		// 문자열이 같지 않은지
//		boolean result = !(str1.equale(str2));

		// 빈 문자열 저장 가능.
//		String str = " ";
		
// ------------------------------------------------------------

		// charAt(n) 특정 위치에 있는 문자를 반환하는 메소드.
		// 반환 타입은 적혀 있듯이 char 타입이다 '홍'을 반환 한다.
//		String str = "저는 홍길동 입니다";
//		char ch = str.charAt(3);
		
		// length() 문자열의 길이를 재는 메소드이다 넘겨줄 인수는 없다.
		// 반환 타입은 int.
//		int len = str.length();
	
		// replace(str,str) 은 특정 문자열을 특정 문자열로 변환하는 메소드이다.
		// 문자열은 한번 선언되면 바뀌지 않기 때문에 새로운 객체를 생성한다.
//		String oldStr = "안녕하세요 저는 홍길동 입니다";
//		String newStr = oldStr.replace("홍길동", "최태현");
//		System.out.println(newStr);
		
		// substring() 은 문자열을 특정 위치에서 특정 위치까지 잘라내어 저장 할수 있는 메소드이다.
		// substring(시작 인덱스, 끝 인덱스) 끝 인덱스는 포함시키지 않고 그 앞까지만 저장 한다.
		// substring(시작 인덱스) 문자열이 끝나는 지점까지 저장한다.
//		String str1 = "032451-468562";
//		String str2 = str1.substring(0,6);
//		String str3 = str1.substring(7);
//		
//		System.out.println(str2);
//		System.out.println(str3);
		
		// indexOf(str) 은 대상 문자열에 인수로 준 문자열이 있으면 똑같은 문자열이 있는 위치의
		// 첫 인덱스를 return한다.
		// 찾는 문자열이 없으면 -1을 반환한다.
//		String str1 = "일본어 상용한자";
//		int index = str1.indexOf("한");
//		System.out.println(index);
		
		// contains(str) 은 대상 문자열에 인수로 준 문자열이 있으면 true,false를 리턴한다.
//		String str = "프로그래밍";
//		boolean result = str.contains("5");
//		System.out.println(result);

		// split() 은 특정 문자를 매개변수로 주어 기준으로 문자열을 나누는 메소드.
//		String str = "나이,지역,학점,재산";
//		String[] arr = str.split(",");
//		for(int i = 0; i < arr.length; i++)
//			System.out.println(arr[i]);
		
	}

}
