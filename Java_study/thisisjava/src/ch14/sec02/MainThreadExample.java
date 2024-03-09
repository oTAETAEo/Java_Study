package ch14.sec02;

public class MainThreadExample {

	public static void main(String[] args) {
		
		System.out.println("시작");
		
		// 현제 스레드의 객체를 리턴한다.
		Thread currThead = Thread.currentThread();
		// 현제 실행된 스레드의 객체 이름 출력.
		System.out.println(currThead.getName());
		
		System.out.println("종료");
		
		
	}

}
