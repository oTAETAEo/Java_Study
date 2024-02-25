package ch08.sec02;

// 인터페이스 키워드는 implements(임플리먼트) 이고 뒤에 인터페이스 명을 적어준다
// 인터페이스를 가져왔으면 인터페이스에 있는 추상 메소드를 무조껀 재정의 해야 한다.
// 인터페이스 객체에 Television 객체를 대입할수 있게 한다.
public class Television implements RemoteControl{

	// 인터페이스가 가지고 있는 추상 메소드 재정의.
	// 인터페이스에서 public가 없다고 해서 메소드 오버라이딩에 안붙히면 오류가 난다.
	
	// @Override (어노테이션) 아래 코드가 정확히 오버라이딩 되었는지 컴파일러에서 알려준다.
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
}
