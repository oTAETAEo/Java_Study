package ch06.sec06.exma01;

public class Car {
	// 필드 선언
	// 필드는 class 블록에 선언된다.
	
	String model = "그랜저";
	boolean start = true;
	String color;
	int speed = 100;
	
	// 생성자 선언
	// 이런 생성자는 따로 선언하지 않아도 다른 생성자가 없다면 바이트 코드파일에 기본 생성자가 생성된다.
	Car(){
		
	}
	
	// 생성자 선언 (오버로딩) 생성자 명은 같지만 매개변수의 타입 순서, 매개변수의 타입, 개수가 다른경우.
	// 생성자 오버로딩을 할때 매개변수의 순서와 타입이 같고 '이름'만 다르면 오버로딩이 아니다.
	// class 파일에 생성자가 하나 이상 선언 되어 있으면 컴파일러는 생성자를 추가하지 않는다.
	// 매개변수의 명은 저장 되는 핃드 명과 동일하게 작성하는게 가독성이 좋다.
	
	// this는 매개변수의 이름이 필드 타입과 같아야 하는데
	// modle = modle; 로 적어버리면 컴파일러가 이게 필드 변수인지 매개변수인지 구분을 하지 못해
	// this로 객체의 필드변수에 매개변수의 값을 넣을수 있도록 한다.
	
	// 이런 생성자 오버로딩이 많아지면 중복되는 코드가 많아지기 때문에 아래처럼 수정한다.
	public Car(String modle){
		// 중복
//		this.model = modle;
//		this.color = "은색";
//		this.speed = 250;
		
		// 매개 변수 3개 가진 생성자 호출
		this(modle,"은색",250);
		
		//이 아래 실행문이 있다면 모든 생성자 호출이 끝나면 다시 돌아와 아래 실행문이 실행된다.
		System.out.println(1);

	}
	
	Car(String modle, String color){
		// 중복
//		this.model = modle;
//		this.color = color;
//		this.speed = 250;
		
		// 매개 변수 3개 가진 생성자 호출
		this(modle,color,250);
		
		//이 아래 실행문이 있다면 모든 생성자 호출이 끝나면 다시 돌아와 아래 실행문이 실행된다.
		System.out.println(2);
	}
	
	Car(String modle, String color, int maxspeed){
		
		// 마지막 생성자 호출.
		this.model = modle;
		this.color = color;
		this.speed = maxspeed;
		System.out.println(3);
		// 생성자 호출이 끝나면 생성자 실행이 종료가 아니라 실행시킨 생성자로 돌아가 아래 실행문 실행.
	}
	
	
}
