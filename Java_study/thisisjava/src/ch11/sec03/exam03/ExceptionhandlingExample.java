package ch11.sec03.exam03;

public class ExceptionhandlingExample {

	public static void main(String[] args) {
		
		String[] array = {"100","1oo", null, "200"};
		
		for(int i = 0; i <= array.length; i++) {
			try {
				System.out.println(array[i].length());
				int value = Integer.parseInt(array[i]);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨:" + e.getMessage());
			} catch (NullPointerException | NumberFormatException e) {
				System.out.println("데이터에 문제가 있음:" + e.getMessage());
			} catch (Exception e) {
				System.out.println("예기치 못한 예외가 생겼습니다");
			}
		}
	}
}

// 예외 처리하는 구문에서 catch는 하나만 실행된다 이유는 try문에서 예외는 한번에 하나만 발생할수 있기 때문이다.
// 하지만 한번에 하나만 발생하는 예외를 처리 해주어도 다음 코드에서 또 다른 예외가 발생할수 있기 떄문에 catch을 
// 여러개 작성할수 있다.

// 각각 발생되는 예외 클래스를 catch에 작성할수 있다.

// 여기서 Exception 이라는 예외 클래스가 있는데 이 클래스는 다른 예외 클래스의 부모기 때문에 이것을 상단에 배치해 놓으면
// 아래 예외처리 구문이 절대 실행되지 않기 때문에 자세한 예외 클래스를 먼저 작성하고 그 아래 Exception 클래스 예외 처리구문을 
// 작성한다.

// 또한 catch (NullPointerException | NumberFormatException e) 이처럼 예외 클래스 사이에 | 를 추가해 이런 예외가 
// 발생하면 동일한 예외 처리를 할수 있다.

// 예외 처리를 해 프로잭트가 정상적으로 종료를 할수 있게 만든다.