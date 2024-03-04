package ch13.sec02.exam02;

public class CarAgency<P> implements Rentable<Car>{

	@Override
	public Car rent() {
		Car t = new Car();
		return t;
	}
}
