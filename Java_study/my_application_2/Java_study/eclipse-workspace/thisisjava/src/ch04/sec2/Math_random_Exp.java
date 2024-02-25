package ch04.sec2;

public class Math_random_Exp {

	public static void main(String[] args) {
		
		// 1부터 10까지의 숫자를 random으로 뽑는 메소드이다.
		
		// (형변환)(Math.random() * n) + start
		// start 부터 start + n 까지의 번호를 뽑으라는 뜻
		
		int num = (int)(Math.random()*20) + 81;
		
		System.out.println(num);

	}

}
