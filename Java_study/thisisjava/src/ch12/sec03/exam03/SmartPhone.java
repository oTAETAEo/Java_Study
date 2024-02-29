package ch12.sec03.exam03;

public class SmartPhone {
	
	private String compane;
	private String os;
	
	public SmartPhone(String compane, String os) {
		this.compane = compane;
		this.os = os;
	}
	
	@Override
	public String toString() {
		return compane + "," + os;
	}
}
