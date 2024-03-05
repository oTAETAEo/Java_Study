package ch13.sec04;

public class GenericExample {

	// 제한된 제너럭 메소드이다. Number 클래스나 Number클래스의 자식만 매개값으로 올수 있다.
	public static <T extends Number> boolean compare(T t1, T t2) {
		System.out.println("compare(" + t1.getClass().getSimpleName() + " " + t2.getClass().getSimpleName() + ")");
		boolean b = (t1.doubleValue() == t2.doubleValue());
		return b;
	}
	
	public static void main(String[] args) {

		boolean b1 = compare(100, 100);
		System.out.println(b1);
		
		boolean b2 = compare(0.1, 0.1);
		System.out.println(b2);
		
				
	}

}
