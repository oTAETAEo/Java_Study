package ch14.sec06.exam01;

public class Calculator {

	private int memory;

	public int getMemory() {
		return memory;
	}

	// synchronized는 하나의 스레드만 실행할수있다.
	public synchronized void setMemory1(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);		
	}
	
	public void setMemory2(int memory) {
		// 동기화 블록을 선언한다 메소드 전체가 아닌 일부분만 잠금을 걸고싶을때 사용.
		// 잠금할 객체를 넣어준다.
		synchronized (this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);		
		}
	}
}
