package ch12.sec04;

public class ExitExample {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			
			if(i == 5) {
				System.out.println("프로그램 강제 종료");
				
				// 최상위 종료 구문 JVM을 종료 시킨다.
				// 정상 종료는 0, 비정상 종료는 -1,1 을 주는것이 관례이다.
				System.exit(0);
			}
		}
	}

}
