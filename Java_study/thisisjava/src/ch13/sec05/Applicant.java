package ch13.sec05;

public class Applicant<T> {

	public T kind;
	
	public Applicant(T t) {
		this.kind = t;
	}
	
}
