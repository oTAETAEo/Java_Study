package ch08.sec09;

// 인터페이스 C만 가져왔지만 C에는 상속 받은 메소드가 2개 + 자신의 메소드 1개 해서 총 3개의 매소드를 오버라이딩을
// 해주어야 한다.
public class MakeMethot implements C{

	@Override
	public void methotA() {
		System.out.println("methotA() 실행");
	}

	@Override
	public void methotB() {
		System.out.println("methotB() 실행");
		
	}

	@Override
	public void methotC() {
		System.out.println("methotC() 실행");
		
	}

	
}
