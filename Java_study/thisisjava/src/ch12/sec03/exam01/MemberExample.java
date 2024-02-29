package ch12.sec03.exam01;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");

		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		
		Member obj3 = new Member("red");

		System.out.println(obj3 == obj2);
		System.out.println(obj3.equals(obj2));

	}

}
