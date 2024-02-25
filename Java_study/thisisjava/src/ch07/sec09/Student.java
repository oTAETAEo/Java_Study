package ch07.sec09;

public class Student extends Person{

	// 필드 선언
	int StudentNum;
	
	// 생성자 오버라이딩.
	public Student(String name, int StudentNum) {	
		// 상위 클래스의 생성자 실행.
		super(name);
		// 돌아와서 실행.
		this.StudentNum = StudentNum;
	}
	
	// Student만의 매소드 생성.
	void study() {
		System.out.println("공부를 합니다");
	}
	
	
}
