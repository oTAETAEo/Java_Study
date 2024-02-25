package ch07.sec11;

// 봉인이 풀려서 sealed(실드) 되어진 클래스를 상속 받을수 있다면 무조껀 
// final (더이상 상속 불가) non-sealed(이 클래스는 봉인되지 않았음), sealed(봉인되었다)
// 라는 키워드를 붙여주어야 한다.

// sealed(봉인) 된 클래스를 permits(퍼밋) 허가를 해주어 상속 받을경우 봉인이 된 클래스의 속성을
// 물려 받기 때문에 봉인된 특성을 풀기 위해서는 non-sealed를 붙힌다.

public non-sealed class Manager extends Person {

	@Override
	public void work() {
		System.out.println("생산 관리를 합니다");
	}
	
}
