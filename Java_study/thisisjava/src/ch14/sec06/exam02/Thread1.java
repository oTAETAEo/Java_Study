package ch14.sec06.exam02;

public class Thread1 extends Thread{

	private WorkObject workObject;
	
	public Thread1(WorkObject workObject) {
		this.workObject = workObject;
		setName("Thread1");
	}
	
	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			workObject.methot1();
		}
		
	}
	
}
