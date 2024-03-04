package ch13.sec01;

public class GenericExample {

	public static void main(String[] args) {
		
		// <> 안에는 기본 타입은 들어갈수 없다.
		// <> 안에는 같은 타입이 들어가야 한다 아래 코드는 
		// 	Box<String> box = new Box<String>(); 의 짧은 버전이다.
		Box<String> box1 = new Box<>();
		box1.content = "안녕하세요";
		String str = box1.content;
		System.out.println(str);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.content = 100;
		// 자동 변환이 된다.
		int num = box2.content;
		System.out.println(num);
		
	}

}
