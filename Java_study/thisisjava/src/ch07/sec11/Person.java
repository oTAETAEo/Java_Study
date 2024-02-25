package ch07.sec11;

// sealed(실드) 키워드는 봉인된 이라는뜻을 가지고 있다 이것을 사용하면 permits(퍼밋) 허가를 해주지
// 않은 클래스는 Person 클래스를 부모로 가질수 없다 라는것이다.
// 사용 방법은 : 공개범위, sealed, class, 클래스 명, permits, 허가해줄 클래스명 순으로 선언 한다
public sealed class Person permits Employee, Manager{

	public String name;
	
	public void work() {
		System.out.println("하는 일이 정해지지 않았습니다");
	}
	
}
