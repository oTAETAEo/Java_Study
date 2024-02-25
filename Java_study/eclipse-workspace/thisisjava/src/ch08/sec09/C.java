package ch08.sec09;


// 인터페이스도 상속이 된다 A 인터페이스에 1개 의 추상 메소드 B 인터페이스에 1개 의 추상 메소드를 상속 받고
// C 인터페이스에 1개 의 추상 메소드 자신의 인터페이스에도 1개가 있어 C에는 총 3가지의 추상 매소드가 있다. 
public interface C extends A, B{
	public abstract void methotC();
}
