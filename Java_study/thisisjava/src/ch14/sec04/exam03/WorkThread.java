package ch14.sec04.exam03;

public class WorkThread extends Thread{

	public boolean work = true;
	
	public WorkThread(String name) {
		setName(name);
	}

	@Override
	public void run() {
		
		while(true) {
			
			if(work) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {}
				System.out.println(getName() + ": 작업처리");
			}else {
				// if 문이 false가 되어 실행이 되면 의미 없는 반복은 중단되고 다른 스레드에게 더 많은 실행을 할수 있도록 양보를 한다.
				// 실행이 되면 실행 대기 상태로 간다.
				Thread.yield();
			}			
		}
	}
}
