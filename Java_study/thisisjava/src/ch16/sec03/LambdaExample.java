package ch16.sec03;

public class LambdaExample {

	public static void main(String[] args) {
		
		// 함수형 프로그래밍은 데이터는 제공이 되고 내가 어떻게 처리 하는지만
		// 람다식으로 정해준다.
		
		Person person = new Person();
		person.action1((name,job)->{
			System.out.print(name + "이 ");
			System.out.println(job + "을 합니다.");
		});
		
		person.action2(content -> {
			System.out.print("\"" + content + "\"");
			System.out.println("라고 말합니다.");
		});
		
		// 실행문이 한줄이면 {} 생략 가능 ;도 작성하지 않는다.
		person.action1((name,job)->
			System.out.println(name + "이 " + job + "을 합니다."));
		
		// 매개변수가 하나면 () 생략 가능. 실행문도 한줄이기 때문에 {}; 생략.
		person.action2(content -> System.out.println("\"" + content + "\"" + "라고 말합니다."));
	}

}
