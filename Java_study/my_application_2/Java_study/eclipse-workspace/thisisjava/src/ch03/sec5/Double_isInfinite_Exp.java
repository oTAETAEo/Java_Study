package ch03.sec5;

public class Double_isInfinite_Exp {

	public static void main(String[] args) {
		
//		// 실행되지 않는 코드
//		int num = 10 / 0;
		
		Double num1 =  10 / 0.0; // Infinity(무한대)
		Double num2 = 10 % 0.0;  // NaN(Not A number)
		
		// Infinity 값이나 NaN 값으로 연산을 하면 /연산을 통해 나온 Infinity출력 나머지 연산을 통해 나온 NaN 출력.
		System.out.println(num1 + 2);
		System.out.println(num2 + 2);
		
		// Double.isInfinite()은 변수의 값이 Infinity값이면 true를 리턴 아니면 false
		Boolean str1 = Double.isInfinite(num1);
		System.out.println(str1);
		
		// Double.isNaN()은 변수의 값이 NaN(Not A number)이면 true를 리턴 아니면 false
		Boolean str2 = Double.isNaN(num2);
		System.out.println(str2);
		
	}

}
