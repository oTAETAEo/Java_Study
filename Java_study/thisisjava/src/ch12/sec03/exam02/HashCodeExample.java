package ch12.sec03.exam02;

public class HashCodeExample {

	public static void main(String[] args) {
		
		Student student1 = new Student("홍길동", 1);
		Student student2 = new Student("홍길동", 1);

		// Student 클래스에서 재정의한 hashCode,equals를 사용해
		// 동일객체인지 확인한다.
		if(student1.hashCode() == student2.hashCode()) {	
			if(student1.equals(student2)) {
				System.out.println("동일 객체입니다.");
			} else {
				System.out.println("데이터가 다르다.");
			}
		} else {
			System.out.println("해시코드가 다르다.");
		}
	}
}
