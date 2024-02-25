package ch05.sec6;

import java.util.Scanner;

public class arr_Exp {

	public static void main(String[] args) {
		
		
		// c++에서는 num1처럼 배열을 선언했지만 num2처럼 하는것이 Java의 관례이다.
//		int num1[] = {1,2,3};
//		int[] num2 = {1,2,3};
		
		// 이 코드는 컴파일 에러가 나는 코드이다.
//		int[] num1;
//		num1 = {1,2,3};
		
		// new 키워드를 이용해 배열을 선언후 객체 주소를 저장한다.
//		int[] num1;
//		num1 = new int[] {1,2,3};
		
		// int[] num = {1,2,3} 으로는 미리 초기화 되어있는 배열을 생성
		// 값의 목록은 없지만 나중에 사용할 배열을 선언한다.
		// int[] num = new int[5] int값 배열을 5칸 생성 한다는 뜻.
		// int[] num 으로 생성만 하고 배열을 사용하면 컴파일 에러가 난다.
//		int[] num = new int[5];
//		Scanner scanner = new Scanner(System.in);
//		
//		for(int i = 0; i < 5; i++)
//			num[i] = scanner.nextInt();
//		for(int i = 0; i < num.length; i++)
//			System.out.println(num[i]);
		
		// 2차원 배열을 선언및 초기화.
//		int[][] num = {{1,2},{1,2}};
//		int[][] num = new int[5][5];
		
		// 참조 타입의 배열은 객체의 주소를 가지고 있는 배열이다.
		// 객체를 참조하기 때문에 각각의 객체에서 메소드를 사용할수 있다.
		String[][] str = {{"안녕"},{"안녕"}};
		System.out.println(str[0][0].length());
		
		// 서로 다를 객체이기 때문에 false가 출력된다.
//		System.out.println(str[0] == str[1]);
		
//		int[] num1 = {1,2,3};
//		int[] num2 = new int[5];
		
		// 배열 복사 메소드이다 System.arraycopy(기존 배열, 기존 배열 시작 인덱스, 새로운 배열, 새로운 배열 시작 인덱스, 기존 배열의 길이);
//		System.arraycopy(num1, 0, num2, 0, num1.length);
//		
//		for(int i = 0; i < num2.length; i++)
//			System.out.println(num2[i]);
		
		// 배열의 길이만큼 도는 for문이다 index 번호가 필요 없다면 사용.
//		String[] name = {"홍길동","이동국","김민재"};
//		for(String str: name)
//			System.out.println(str);

		
	}

}
