package ch14.sec06.exam02;

public class WorkObject {

	// 아래 메소드는 실행이되면 객체가 락이 걸린다.
	// 각각의 메소드에 synchronized 코드가 있을 경우에만 사용할수 있는 notify(), wait()가 있다.
	// notify() : 일시정지된 스레드를 실행 대기 상태로 전환 일시정지된 스레드가 많다면 무작위로 깨운다 구현에 따라 달라질수 있다. 
	// notifyAll() : 모든 일시정지된 스레드를 한번에 전부 깨운다.
	// wait() : 실행되고 있는 스레드를 일시정지한다.
	
	public synchronized void methot1() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methot1 작업실행.");
		
		// 지금 일시정지된 스레드를 실행대기로 바꾸는 메소드.
		notify();
		
		try {
			// 자기 자신을 일시정지 시킨다.
			wait();
		} catch (InterruptedException e) {
		}
	}
	
	public synchronized void methot2() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methot2 작업실행.");
		
		notify();
		
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
	
	
}
