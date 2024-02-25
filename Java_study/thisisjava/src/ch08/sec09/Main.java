package ch08.sec09;

public class Main {

	public static void main(String[] args) {
		
		MakeMethot makeMethot = new MakeMethot();
		
		// A 인터페이스에만 저장되어 있는 메소드
		A a = makeMethot;
		a.methotA();
		
		// B 인터페이스에만 저장되어 있는 메소드
		B b = makeMethot;
		b.methotB();
		
		// A,B를 상속 받은 C는 촐 3개의 매소드르 사용할수 있다.
		C c = makeMethot;
		c.methotA();
		c.methotB();
		c.methotC();
		
	}

}
