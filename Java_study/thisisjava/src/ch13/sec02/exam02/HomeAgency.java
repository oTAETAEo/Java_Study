package ch13.sec02.exam02;

// HomeAgency 클래스가 Home 타입의 객체를 대여하고 관리하는 클래스임을 나타냄
public class HomeAgency implements Rentable<Home>{
	@Override
	public Home rent() {
		return new Home();
	}
}


// 컬렉션 프레임워크에서도 Stack<> <>안에 Integer, String ... 등등 
// 여러 객체 타입이 선언될수 있듯이 Rentable에는 어느어느 객체만 들어갈수 있다
// 라는것을 Rentable<Home> 명시해준다.