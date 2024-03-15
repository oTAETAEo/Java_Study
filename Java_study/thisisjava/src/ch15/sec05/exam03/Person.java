package ch15.sec05.exam03;

// TreeSet,TreeMap에 저장 할수 있는 객체는 Comparable 인터페이스를 구현해야지 저장할수 있다.
public class Person implements Comparable<Person>{

	public String name;
	public int age;
	
	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	// 값을 삽입할때 비교할 기준을 잡아 크거나(1) 작거나(-1) 같거나(0)를 리턴
	@Override
	public int compareTo(Person o) {
		if(age > o.age) return 1;
		else if(age < o.age) return -1;
		else return 0;
	}
	
}
