package ch17.sec04.exam01;

public class Product {

	private int pno;
	private String name;
	private String company;
	private int price;
	
	public Product(int pno, String name, String company, int price) {
		this.pno = pno;
		this.name = name;
		this.company = company;
		this.price = price;
	}
	
	public int getPno() {
		return pno;
	}
	public String getName() {
		return name;
	}
	public String getCompany() {
		return company;
	}
	public int getPrice() {
		return price;
	}
	
	// StringBuilder 클래스.
	// 문자열을 유용하게 다룬다.
	@Override
	public String toString() {
		return new StringBuilder()
				.append("{")
				.append("pon" + pno + ", ")
				.append("name" + name + ", ")
				.append("company" + company + ", ")
				.append("price" + price)
				.append("}")
				.toString();
	}
	
	
}
