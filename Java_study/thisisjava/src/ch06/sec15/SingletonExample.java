package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		
		// 정적메소드를 사용해 객체를 가져온다.
		Singleton sing1 = Singleton.gerInstance();
		Singleton sing2 = Singleton.gerInstance();
		
		if(sing1 == sing2) {
			System.out.println("같은 객체입니다");
		}else {
			System.out.println("같은 객체가 아닙니다");
		}
	}

}
