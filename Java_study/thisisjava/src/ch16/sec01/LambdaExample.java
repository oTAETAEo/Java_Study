package ch16.sec01;

public class LambdaExample {

	public static void main(String[] args) {
		
		// 람다식1
		action((x,y)-> {
			int T = x + y;
			System.out.println("result: " + T);
		});
		
		// 람다식2
		action((x,y)-> {
			int T = x - y;
			System.out.println("result: " + T);
		});
	}

	public static void action(Calculable calculable) {
		int x = 10;
		int y = 4;
		calculable.calculate(x, y);
		
		
	}
}
