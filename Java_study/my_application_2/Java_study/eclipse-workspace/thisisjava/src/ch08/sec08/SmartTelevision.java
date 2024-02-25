package ch08.sec08;

// SmartTelevision 클래스는 다중 인터페이스를 사용 가능하다.
// 다중으로 인터페이스를 받을경우 인터페이스에 있는 매소드를 모두 오버라이딩을 해야한다.
// 당연히 default로 만들어진 메소드는 이 클래스에 맞지 않다면 재정의를 한다.
public class SmartTelevision implements RemoteControl, Search{
	
	@Override
	public void search(String url) {
		System.out.println(url + "를 검색합니다");
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}
	
}
