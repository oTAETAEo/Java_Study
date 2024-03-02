package ch12.sec06;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		
		// Random 객체는 생성할때 시드 값을 줄수 있는데 시드값이 같다면 서로 동일한 난수 값을 얻게 된다. 
		
		// 선택번호
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		
		for(int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
		}
		
		// 당첨번호
		int[] winningNumber = new int[6];
		Random random2 = new Random(3);
		
		for(int i = 0; i < 6; i++) {
			winningNumber[i] = random2.nextInt(45) + 1;
		}
		
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		
		if(Arrays.equals(selectNumber, winningNumber)) {
			System.out.println("당첨입니다");
		}else {
			System.out.println("다음기회에");
		}
	}

}
