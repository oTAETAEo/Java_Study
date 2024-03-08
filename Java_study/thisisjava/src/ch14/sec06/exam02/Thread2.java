package ch14.sec06.exam02;

public class Thread2 extends Thread{

private WorkObject workObject;
	
	public Thread2(WorkObject workObject) {
		this.workObject = workObject;
		setName("Thread2");
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			workObject.methot1();
		}
		
	}
}
