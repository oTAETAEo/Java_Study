package ch13.sec02.exam01;

public class GenericExample {

	public static void main(String[] args) {
		
		// 여러개의 타입 파라미터를 받을수 있다 
		Product<Car, String> product1 = new Product<Car, String>();
		
		product1.setKind(new Car());
		product1.setModel("기아");
		
		Product<Tv, String> product2 = new Product<Tv, String>();
		
		product2.setKind(new Tv());
		product2.setModel("삼성");
		
		Car car1 = product1.getKind();
		System.out.println(product1.getModel());
		
		Tv tv = product2.getKind();
		System.out.println(product2.getModel());
		
	}

}
