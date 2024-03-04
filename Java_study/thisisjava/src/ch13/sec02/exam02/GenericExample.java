package ch13.sec02.exam02;

public class GenericExample {

	public static void main(String[] args) {
		
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		home.trunOnLigth();
		
		CarAgency<Car> agency = new CarAgency<Car>();
		Car car1 = agency.rent();
		car1.run();
		
		
	}

}
