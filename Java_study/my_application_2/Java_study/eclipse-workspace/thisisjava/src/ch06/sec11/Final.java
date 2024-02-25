package ch06.sec11;

public class Final {

	public static void main(String[] args) {
	
		// final의 초기값을 주는 방법은 선언과 동시에 주는 방법과 생성자로 초기값 대입 하는것이 있다
		// final은 초기값이나 생성자의 의해 값이 정해지면 값을 바꿀수 없다. 
		Kor kor = new Kor("124578-1236659", "홍길동");
		
		System.out.println(kor.nation);
		System.out.println(kor.ssn);
		System.out.println(kor.name);
		
		// fianl이 아니면 변경 가능.
		kor.name = "차차차";
		
		// 정적블록으로 계산한 상수 값 출력.
		System.out.println(Kor.Earth_Circumference + "km^2");
	}

}
