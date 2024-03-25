package ch16.sec05.exam03;

public class Member {
	
	private String id; 
	private String name;
	
	// 생성자.
	public Member(String id) {
		this.id = id;
		System.out.println("Member(String id)");
	}
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Member(String id, String name)");
	}
	
	@Override
	public String toString() {
		String inof = "{id " + id + "name " + name + "}";
		return inof;
	}
}
