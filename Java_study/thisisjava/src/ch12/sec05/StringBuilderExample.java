package ch12.sec05;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		// 문자열 작업을 효율적이게 만들어주는 클래스이다.
		// String 객체에서 문자열을 바꾸려면 새로운 객체가 생성되지만 이 클래스를 사용하면 새오룬 객체를 만들지 않고
		// 문자열을 조작할수 있다.
		
		// 메소드 체이닝을 사용할수 있다.
		// 각각의 메소드는 메소드의 동작이 끝난후의 객체를 리턴한다 (toString() 메소드는 제외).
		String data = new StringBuilder()
			.append("ABC")
			.append("DEF")
			.toString();
		
		System.out.println(data);
		
		StringBuilder data1 = new StringBuilder()
				.append("vnj");
		data1.append("aadd");
		System.out.println(data1.toString());

		
	}

}
