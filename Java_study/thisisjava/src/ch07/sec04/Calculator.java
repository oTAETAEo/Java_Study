package ch07.sec04;

public class Calculator {

	public double areaCircle(double r) {
		System.out.println("Calculator의 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
	
	public void sumCount(int ... num) {
		System.out.print("더해진 숫자는 :");
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
	
	// 공개 지정자 앞에 final이 붙는다면 상속을 받은 클래스에서 오버라이딩을 할수 없다.
	public final void total(int ...num) {
		
	}
	
}

	// class도 위와 같이 공개 지정자 앞에 final이 붙으면 상속을 해줄수 없다 부모가 될수 앖다.
// public final class Calculator {}