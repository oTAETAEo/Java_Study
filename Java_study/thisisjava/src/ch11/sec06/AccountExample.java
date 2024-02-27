package ch11.sec06;

public class AccountExample {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		// 예금
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		
		// 일반 예외이기 때문에 컴파일러에 예외가 생긴다.
//		account.withdraw(100);
		
		// 예외 처리.
		try {
			account.withdraw(30000);
		} catch (InsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
		
		System.out.println("예금액: "+ account.getBalance());
		
	}
}
