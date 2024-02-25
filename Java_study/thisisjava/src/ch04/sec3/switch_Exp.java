package ch04.sec3;

import java.util.Scanner;

public class switch_Exp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		// Java12 부터 case 1 -> {} 화살표를 이용해 블럭을 만들수 있다.
		// 이걸 사용하면 각각에 있어야할 break문을 생략 할수 있다.
		switch(num) {
			case 1 ->{
				System.out.println("숫자는 1입니다");
			}
			case 2 ->{
				System.out.println("숫자는 2입니다");
			}
			case 3 ->{
				System.out.println("숫자는 3입니다");
			}
			case 4 ->{
				System.out.println("숫자는 4입니다");
			}
			default ->{
				System.out.println("5이상입니다");
			}
		}
		
		// Java 13부터 사용가능한 코드이다.
		// int형인 num2변수에 입력받은 num의 case를 이용해 num2에 저장할 값을 return한다.
		// 이 코드에서는 default는 필수이고 yield 키워드로 값을 저장 한다.
		// default 필수인 이유는 case값이 아닌 경우가 들어오면 필요한 문장이기 때문이다.
		// switch문의 중괄호 끝에는 세미콜론이 필수이다.
		int num2 = switch(num) {
			case 1 -> 100;
			case 2 -> {
				int T = num - 20;
				yield T;
			}
			case 3 -> {
				int T = num - 30;
				yield T;
			}
			default -> 60;
		};
		
		System.out.println(num2);
	}
}
