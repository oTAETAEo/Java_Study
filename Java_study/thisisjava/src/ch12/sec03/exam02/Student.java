package ch12.sec03.exam02;

public class Student {

	private String name;
	private int num;
	
	// 생성자
	public Student(String name, int num) {
		this.name = name;
		this.num = num;
	}

	// Getters
	public String getName() {
		return name;
	}
	public int getNum() {
		return num;
	}
	
	@Override
	public int hashCode() {
		int hashCode = num + name.hashCode();
		return hashCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student taget) {
			if(name.equals(taget.getName()) && num == taget.getNum()) {
				return true;
			}
		}
		return false;
	}

}
