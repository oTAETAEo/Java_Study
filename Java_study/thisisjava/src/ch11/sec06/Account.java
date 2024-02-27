package ch11.sec06;

public class Account {
	
	// 잔고.
	private long balance;
	
	// 생성자
	public Account() {}

	// Getter
	public long getBalance() {
		return balance;
	}

	public void deposit(long money) {
		balance += money;
	}
	
	// 예외 발생 코드
	// 예외가 발생할수 있는 메소드.
	public void withdraw(long money) throws InsufficientException{
		if(balance < money) {
			// 잔고보다 크면 예외 발생 throw 
			// 발생 한다면 InsufficientException 클래스로 예외 이유와 함께 던진다.
			throw new InsufficientException("잔고 부족: " + (money-balance) +"모자랍니다");	
		}
		// 예외가 발생하면 아래 코드 실행 x
		balance -= money;
	}
	
	
}
