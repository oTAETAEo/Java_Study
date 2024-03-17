package ch16.sec05.exam02;

public class MethodReferenceExample {

	public static void main(String[] args) {

		Person person = new Person();
		
		// 아래 3가지 방법은 똑같다.
		
		// a의 메소드를 참조.
		person.ordering((a, b) -> {
			return a.compareToIgnoreCase(b);
		});
		
		// 매개변수 a의 메소드를 사용해 b를 매개값으로 넘긴다.
		person.ordering((a, b) -> a.compareToIgnoreCase(b));
		
		// 정적 메소드 참조 하는 방법과 똑같지만 이것은 매개변수의 메소드를 참조 하는것이다.
		person.ordering(String :: compareToIgnoreCase);
	}

}
