package ch07.sec11;

// 봉인이 풀려서 sealed(실드) 되어진 클래스를 상속 받을수 있다면 무조껀 
// final (더이상 상속 불가) non-sealed(이 클래스는 봉인되지 않았음), sealed(봉인되었다)
// 라는 키워드를 붙여주어야 한다.
public final class Employee extends Person{

	@Override
	public void work() {
		System.out.println("제품을 생산합니다");
	}
}
