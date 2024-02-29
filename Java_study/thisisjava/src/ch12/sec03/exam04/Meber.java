package ch12.sec03.exam04;


// 클래스를 recode로 선언 하고 중괄호에 데이터를 저장할 필드를 넣으면 자동적으로
// 필드,생성자,Getters,Setters,toString,hashCode,equals 매소드를 재정의한 코드가 생성된다.
public record Meber (String id, String name, int age){
	
	// 작성된 코드는 없지만 자동으로 생성 되어있다.
	
}
