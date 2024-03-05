package ch13.sec05;

public class GenericExample {

	public static void main(String[] args) {

		// Course.reissterCourse1() 메소드는 타입 파라미터에 <?>만 있기 때문에 어떠한 객체든 올수있다.
		Course.reissterCourse1(new Applicant<Person>(new Person()));
		Course.reissterCourse1(new Applicant<Worker>(new Worker()));
		Course.reissterCourse1(new Applicant<Student>(new Student()));
		Course.reissterCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.reissterCourse1(new Applicant<Middle>(new Middle()));

		// Course.reissterCourse2() 메소드의 타입 파라미터는 <? extends Student>이기 때문에 Student 객체 포함 Student의 자식 객체만 올수 있다.
		Course.reissterCourse2(new Applicant<Student>(new Student()));
		Course.reissterCourse2(new Applicant<Student>(new HighStudent()));
		Course.reissterCourse2(new Applicant<Student>(new Middle()));
		
		// Course.reissterCourse3() 메소드의 타입 파라미터는 <? super Worker>이기 때문에 Worker 객체 포함 Worker의 부모 객체만 올수 있다.
		Course.reissterCourse3(new Applicant<Worker>(new Worker()));
		Course.reissterCourse3(new Applicant<Person>(new Person()));
	}

}
