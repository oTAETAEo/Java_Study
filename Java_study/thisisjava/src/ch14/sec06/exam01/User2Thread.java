package ch14.sec06.exam01;

// Thread의 자식 객체. 
public class User2Thread extends Thread{

	private Calculator calculator;
	
	public User2Thread() {
		setName("User2Threade");
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory2(50);
	}
}
