package ch13.sec03;

public class GenericExample {

	public static <T> Box<T> boxing(T t) {
		Box box = new Box<T>();
		box.setT(t);
		return box;
	}
	
	public static void main(String[] args) {

		Box<String> box1 = boxing("안녕");
		System.out.println(box1.getT());
		
		Box<Integer> box2 = boxing(100);
		System.out.println(box2.getT());
		
	}

}
