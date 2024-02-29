package ch12.sec03.exam04;

public class RecordExample {

	public static void main(String[] args) {
		
		Meber meber1 = new Meber("choi", "태태", 22);

		System.out.println(meber1.id());
		System.out.println(meber1.name());
		System.out.println(meber1.age());
		System.out.println(meber1.toString());
		
		Meber meber2 = new Meber("choi", "태태", 22);
		Meber meber3 = new Meber("choi", "태태", 22);
		
		System.out.println("meber2 hash code: " + meber2.hashCode());
		System.out.println("meber3 hash code: " + meber3.hashCode());
		
		System.out.println("동등 객체: " + meber2.equals(meber3));
	}

}
