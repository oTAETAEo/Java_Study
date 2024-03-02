package ch12.sec06;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		
		// Integer는 박스 클래스이다. new 로 만들어야 하는거 아닌가? 그래도 된다.
		// (Boxing)
		Integer obj1 = 100;
		Integer obj2 = new Integer(100);
		
		System.out.println(obj1.intValue());
		System.out.println(obj2.intValue());
		
		// obj1의 값을 가져온후 (UnBoxing) 값을 계산한다.
		int value = obj1 + 50;
		System.out.println(value);
		
		// 박스 객체의 값을 비교 하려면 equals() 메소드를 사용한다.
		System.out.println(obj1.equals(obj2));
		
		
		// 각각의 기본 변수의 박스 클래스는 기본변수 타입의 첫 글자만 대문자이다.
		// int,char 제외.
		// int = Integer, char = Character

		
	}

}
