package ch13.sec05;

public class Course {

	// Applicant<?>는 모든 객체가 올수 있다.
	public static void reissterCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함.");
	}
	
	// Applicant<? extends Student>는 Student포함 의 자식 객체만 올수있다.
	public static void reissterCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course2을 등록함.");
	}
	
	// Applicant<? super Worker>는 Worker포함 Worker의 상위 객체만 올수있다.
	public static void reissterCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course3을 등록함.");
	}

}
