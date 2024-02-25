package ch07.sec04;

public class Computer extends Calculator{

	// 메소드 오버라이딩을 하는 경우는 부모 매소드가 자식클래스에 맞게끔 설정 되어있으면 이상적인
	// 상속 이지만 어떤 클래스는 자식 클래스가 사용하기에 적합하지 않을수 있어 자식 클래스에서
	// 재정의 하는것을 메소드 오버라이딩이라고 한다.
	
	// 부모 클래스의 매소드와 자식 클래스에서 오버라이딩을 하려면 공개 범위는 더 강화되면 안되고
	// 리턴 타입, 메소드 명, 매개변수가 같아야 한다. 대부분 부모 매소드 시그니처와 똑같이 재정의 한다
	// 매소드의 명이 다를경우 새로운 매소드를 재정의 하는것과 같다.
	
	// 이것을 붙이면 컴파일러가 정확하게 재정의가 되었는지 체크해준다
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer의 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}

	// 복사해서 붙여넣기가 더 빠를수도 있지만 (컨트롤 + 스페이스바)를 눌러 오버라이딩을 하고싶은
	// 메소드를 선택하면 아래처럼 자동으로 코드가 작성된다.
	// 그 후 매소드 실행코드를 작성하면 된다. 실수를 줄일수 있다.
	// 위에 Source 항목을 선택후 Override 항목을 선택해 만들수도 있다. 
	
//	@Override
//	public double areaCircle(double r) {
//		// TODO Auto-generated method stub
//		return super.areaCircle(r);
//	}
	
	// 기존의 sumCount는 어느 숫자가 더해졌는지 출력을 하는것이지만 오버라이딩한 메소드는 몇개의 숫자가
	// 더해졌는지 출력하는 코드를 작성하는 코드이다.
	@Override
	public void sumCount(int... num) {
		
		// 이렇게 부모 매소드의 코드를 복사해서 가져올수도 있지만 이것이 만약 100줄 이상 더욱 많은 코드가
		// 있다면 코드의 길이도 길어지고 보기도 힘들것이다 이때 사용할수 있는 키워드가 있다.
//		System.out.print("더해진 숫자는 :");
//		for(int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
//		
//		int count = 0;
//		for(int i = 0; i < num.length; i++) {
//			count++;
//		}
//		System.out.println("총 더해진 개수는 :" + count + "입니다.");
		
		// 이때 사용할수 있는 키워드는 super 키워드다 도트 구분자로 부모의 메소드를 실행해 위에 복사한
		// 코드를 이 한줄로 실행을 할수있다.
		// 만약에 100줄 + a 이 아닌 100줄 안에 있는 코드를 바꿔야 한다면 부모 클래스의 메소드를 수정
		// 하고. if문으로 구분을 해 부모 메소드를 실행 시킬껀지 오버라이딩 한 자식 메소드를 실행 시킬껀지
		// 선택하는 코드도 작성할수 있다.
		// 아래 코드는 위에 코드와 동일한 작동을 한다.
		super.sumCount(num);
		int count = 0;
		for(int i = 0; i < num.length; i++) {
			count++;
		}
		System.out.println("총 더해진 개수는 :" + count + "입니다.");
	}
	
	// Calculator 클래스의 total 메소드를 오버라이딩 하려고 하지만 final이 붙어있어 불가능 하다.
}








