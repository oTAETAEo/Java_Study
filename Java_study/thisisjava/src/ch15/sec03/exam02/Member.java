package ch15.sec03.exam02;

public class Member {
	
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 재정의 하지 않으면 동등객체를 찾을수 없다.
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			return target.name.equals(name) && (target.age == age);
		} else {
			return false;
		}
	}
	
}
