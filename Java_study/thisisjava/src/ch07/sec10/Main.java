package ch07.sec10;

public class Main {

	public static void main(String[] args) {
		
		// 이 코드는 추상 클래스이기 때문에 객체 생성은 안된다.
//		Animal animal = new Animal();
			
		Cat cat = new Cat("삐삐");
		cat.sound();
		
		Dog dog = new Dog("칸");
		dog.sound();
		
		System.out.println(dog.name);
		System.out.println(cat.name);
		
		AnimalSound(dog);
		AnimalSound(cat);
		
	}
	
	// main에서 바로 사용 가능하게 정적 메소드 생성.
	public static void AnimalSound(Animal animal) {
		
		// 타입 변환이 되기 전 객체가 Dog 객체였을 경우
		if(animal instanceof Dog dog) {
			System.out.println("강아지");
		}
		if(animal instanceof Cat cat) {
			System.out.println("고양이");
		}
		
		// 모든 클래스는 Object를 상속 받고 있기 때문에 true다.
		if(animal instanceof Object) {
			System.out.println("Odject를 상속 받고 있다");
		}
		
		// 매개변수로 자식 객체가 들어올수 있다.
		// 자식에서 부모로 매게변수에서 자동으로 타입 변환 되기 때문에 오버라이딩 된 sound()가 
		// 실행 된다.
		animal.sound();
	}
	
}
