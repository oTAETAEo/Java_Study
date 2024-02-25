// package의 명은 주로 계발 회사의 도메인이름의 역순으로 만든다 예를 들어 choi.com 이면
// package 명은 com.choi로 만드는것이 관례.
// 상위 패키지와 하위 패키지는 .으로 구분된다.
// package 상위패키지.하위패키지
// 모두 소문자로 작성하는게 관례이다.
// 패키지 없이 클래스를 만들면 디폴트 패키지로 들어간다.
// class의 이름이 겹칠수 있으니 패키지로 구분을 한다.
package ch06.sec11;

// import문은 다른 패키지의 클래스를 가져와서 사용할때 상위 패키지 이름부터 .으로 구분해 클래스 이름
// 까지 작성해 하나의 클래스를 가져온다.
// 하지만 그 패키지의 모든 클래스를 사용하고 싶으면 클래스명 자리에 '*' 를 사용해 모든 클래스를 가져온다.
// 그러면 상위 패키지의 이름만 적고 '*'만 사용하면 되는거 아니냐 하는데 이것은 아니다.
// 직속 상위 패키지와 직속 하위 패키지에는 개수도 다르고 타입도 다른 클래스가 있는데 그 모든것을 사용한다는것이 아니라
// 상위패키지.* 를 사용하면 상위패키지에 있는 클래스만 사용가능하고 상위 패키지.하위 패키지.*면 하위패키지 클래스만
// 사용 가능하다 
// import 자동 추가 기능 (컨트롤 + 시프트 + o)
// 둘다 사용하고 싶을때
// exma01에 있는 클래스 사용.
// import ch06.sec06.exma01.*;
// sec06에 있는 클래스 사용 
// import ch06.sec06.*;

// 각각의 import문에는 하나의 패키지의 클래스만 가져올수 있다 상위껄 가져온다고 해서 아래꺼까지 가져오는것이 아니다.
import ch06.sec06.exma01.Car;
import ch06.sec08.exma01.*;

// class의 전체 이름은 ch06.sec11.Kor 이다.
public class Kor {

	// 인스턴스 final 필드 선언.
	final String nation = "대한민국";
	final String ssn;
	
	// 인스턴스 필드 선언.
	String name;
	
	Kor(String ssn, String name){
		this.ssn = ssn;
		this.name = name;
	}
	
	// 상수 값은 모두 대문자로 선언 하고 단어사이에 _로 연결한다.
	// pi나 지구의 둘래 무게 등등 불변의 값을 저장한다.
	static final double Earth_RADIUS = 6400;
	
	// 복잡한 계산을 통해 얻어지는 상수는 정적 블록을 통해 초기화 한다.
	static final double Earth_Circumference;
	static {
		Earth_Circumference = 4 * Math.PI * Earth_RADIUS * Earth_RADIUS;
	}
	
	// import해서 가져온 클래스 객체 생성.
	Calculator calculator = new Calculator();
	Car car = new Car("현대");
	
	// 선언한 imoprt문에 동일한 클래스명이 있다면 클래스의 전체 이름을 사용해 지정해준다.
	// 이렇게 사용하면 import 저체가 필요없다.
	ch06.sec08.exma01.Calculator ca1 = new ch06.sec08.exma01.Calculator();

}
