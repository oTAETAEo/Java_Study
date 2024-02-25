package ch07.sec11;

// non-sealed 키워드로 봉인이 풀렸기 때문에 허가 없이 상속이 가능하다. 
public class Dractor extends Manager{
	
	@Override
	public void work() {
		System.out.println("제품을 기획한다");
	}
}
