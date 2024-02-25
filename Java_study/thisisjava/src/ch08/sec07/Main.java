package ch08.sec07;

public class Main {

	public static void main(String[] args) {
			
		// 인터페이스 변수에 사용한 객체 대입.
		Service service = new ServiceImp();
		
		service.defaultMethpt1();
		service.defaultMethpt2();
		
		Service.staticMethot1();
		Service.staticMethot2();
		
	}

}
