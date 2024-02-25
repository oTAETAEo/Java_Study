package ch06.sec08.exma01;

public class Calculator {
	
	// 객체가 선언 되어야지만 사용할수 있는 것을 인스턴스 맴버라고 한다.
	// 여기 있는 메소드는 인스턴스 메소드이다.
	// 객체마다 데이터는 heep영역에 생성되지만 메소드는 각각의 객체에 선언되어 사용되는게 
	// 아닌 바이트 코드 파일에만 저장이 돼 공유되어 사용.
	// 메소드는 바뀌지 않는 코드이기때문에 각각 저장될 필요가 없다.
	// 객체의 소속된 필드에 this를 사용할수 있다 하지만 정적변수는 객체에 소속이 되어있지 않아 사용x
	// 인스턴스 맴버 = 객체가 있어야 사용가능한 메소드 및 필드
	// 메소드 이름은 소문자로 시작 하는것이 관례.
	
// 인스턴스 매소드.
	
	// 리턴 타입 x
	void powerOn() {
		System.out.println("전원이 켜졌다.");
	}
	void powerOff() {
		System.out.println("전원이 꺼졌다.");
	}
	
	// 리턴이 있어야함.
	int plus(int x, int y) {
		int T = x+y;
		return T;
	}
	
	double divide(int x, int y) {
		double T = (double)x/ (double)y;
		return T;
	}
	
	// 가변길이 매소드 매개값을 몇개 줄지 모를때.
	// 이런 가변길이 매소드는 자동으로 배열로 만들어져 값이 들어온다.
	int sum(int ... values) {
		int T = 0;
		
		for(int i = 0; i < values.length; i++) {
			T += values[i];
		}
		return T;
	}
	
	// 메소드 오버로딩 메소드 이름은 같지만 매개변수의 타입과, 개수, 순서가 다른 메소드를 선언하는 것.
	
	// 이러면 puls 매소드를 실행할때 매개값이 정수이면 위에 puls 실행 실수이면 이 메소드를 실행한다.
	// System.out.println()이 메소드 오버로딩의 예이다. 
	double puls(double x, double y) {
		double T = x+y;
		return T;
	}
	
	// 사각형의 넚이를 구하는 메소드
	// 메소드 오버로딩으로 매개값이 하나면 정사각형으로 간주, 두개면 직사각형으로 간주해 각각에 맞는
	// 메소드가 실행된다.
	
	// 정사각형.
	double area_a_square(double x) {
		return x*x;
	}
	
	// 직사각형 
	double area_a_square(double x, double y) {
		return x*y;
	}
	
	// 정적 맴버란 객체가 선언되지 않아도 사용할수 있는것을 말한다.
	// 정적 맴버를 사용하려면 static 키워드를 추가한다.
	// 사용은 해야하지만 바뀌지 않을 데이터를 저장할때 사용 예) 국적, 파이 등등
	// 값을 바꿀수 있다 위치는 메소드 영역에 만들어진다.
	// 객체를 사용해야 하는 코드가 있다면 static 사용하지 않는다 
	
	// 정적 맴버 = 객체가 없어도 사용가능한 메소드 및 필드
	
	String color;
	static double pi = 3.14;
	
// 정적 매소드 	
	static int Plus(int x, int y) {
		return x + y;
	}
	
	static int Minus(int x, int y) {
		return x - y;
	}
	
	// 정적 블록은 클레스가 메모리로 로딩될때 자동으로 실행된다.
	// 인스턴스 맴버는 생성자로 초기화 되지만 정적 필드는 객체를 생성하지 않고 사용할수 있다
	// 이뜻은 생성자가 실행되지 않는다는 뜻이기 때문에 정적 블록을 이용해 초기화를 한다.
	// 정적 필드는 대부분 선언 하면서 초기값을 넣는다.
	// 정적 메소드와 블록은 객체없이 사용하기 때문에 인스턴스 맴버를 사용할수 없다 this도 사용 x.
	// 사용하고 싶으면 블록 안에서 객체를 생성해서 사용한다.
	// 정적 블록은 복잡한 초기화를 할때 사용된다.
	
	static String company = "Mycompany";
	static String model = "LCD";
	static String inof;
	
	// 클래스가 로딩될때 아래 코드는 실행되어 문자열이 저장되어있다.
	static {
		inof = company + " " + model;
	}
	
	static {
		// 객체를 생성해 인스턴스 맴버를 사용.
		Calculator calculator = new Calculator();
		// 컴파일을 하면 로딩이 되어 제일 먼저 실행되는 출력문이다.
		System.out.println(1);
	}
}









