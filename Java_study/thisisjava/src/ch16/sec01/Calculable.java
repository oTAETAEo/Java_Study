package ch16.sec01;
// 단 하나의 추상 메소드만 선언 되어있는것.
// 함수형 인터페이스.
@FunctionalInterface
public interface Calculable {
	
	void calculate(int x, int y);
}
