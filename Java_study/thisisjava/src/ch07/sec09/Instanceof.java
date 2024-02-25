package ch07.sec09;

public class Instanceof {

	public static void methot(Person person) {
		System.out.println("학생 이름 : " + person.name);
		person.walk();
		
		// 부모 객체로 받은 매개변수가 Student 객체였는지 확인.
//		if(person instanceof Student) {
//			// 위 조건식이 맞다면 타입 변환.
//			Student student = (Student)person;
//			System.out.println("학생 번호 : " + student.StudentNum);
//			student.study();
//		}
		
		// 부모 객체로 받은 매개변수가 Student 객체였는지 확인.
		// 이 형식은 위의 코드와 동일한 작동을 한다 이런 형식은 JAVA 12 이상부터 사용 가능하다.
		// if 문의 형식이 조금 다른데 위처럼 확인 하는 동작은 같고 맞다면 student 객체에
		// 자동으로 타입 변환이 되어서 저장된다. 
		// 한번에 검사부터 true 라면 형변환 해서 저장까지 한번에 해주는 코드이다.
		if(person instanceof Student student) {
			
			// StudentNum() 메소드는 Student 클래스에 선언된 메소드이기 때문에
			// 형변환 후 사용 가능하다. 위에 if문에서 자동으로 형 변환 되어있다.
			System.out.println("학생번호 : " + student.StudentNum);
			student.study();
		}
	}
	
	public static void main(String[] args) {
		
		Person person = new Person("홍길동");
		methot(person);
		
		Student student = new Student("김민재", 10);
		methot(student);
	}

}
