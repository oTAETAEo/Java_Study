package ch07.sec11;

public class Main {

	public static void main(String[] args) {
		
		// 봉인된 클래스여도 객체 생성은 가능하다.
		Person person = new Person();
		
		Employee employee = new Employee();
		Manager manager = new Manager();
		Dractor dractor = new Dractor();
		
		person.work();
		employee.work();
		manager.work();
		dractor.work();
		
	}

}
