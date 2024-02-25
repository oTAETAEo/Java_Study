package ch07.sec07.exam02;

public class CaildExample {

	public static void main(String[] args) {
		
		// 타입 변환은 byte -> int -> long ... 으로 작은거에서 큰것으로 변환을 할수 있다.
		// 하지만 int -> byte로 변환 할수는 없다 객체 타입 변환도 같다.
		// 자식 객체는 부모 객체가 될수 있다. 
		// 고양이(자식)는 동물(부모)이다. 동물은 고양이다 라는 말은 성립이 되지 않는다.
		// Caild의 객체를 가지고 있는 caild를 Parent로 타입 변환해 주소 저장.
		
		// 자식 객체 생성.
		Caild caild = new Caild();
		// 부모 객체로 타입 변환.
		Parent parent = caild;
		// 위의 두 코드를 한줄로 표현. 자식 객체가 생성되면 자동으로 부모 객체가 생성된다.
		Parent parent1 = new Caild();
		
		// 자식 객체는 부모의 상속 받은 매소드와 자신의 매소드 모두 사용 가능하다.
		caild.method1();
		caild.method2();
		caild.method3();
		
		// 부모 객체로 타입 변환을해 저장한 parent 객체는 Parent클래스에 저장 되어있는
		// 두개의 클래스만 사용 가능하다.
		// 여기서 함정은 메소드 오버라이딩한 method2() 메소드는 부모 객체의 method2() 메소드가 아닌
		// 자식 객체의 오버라이딩 된 메소드가 출력 된다.
		// 이것은 다형성과 관련이 있기 때문에 작 기억 해야 한다.
		parent.method1();
		parent.method2();
		
		// 위에서 자식 객체는 부모 객체가 될수 있다고 했지만 부모 객체는 자식 책체가 될수 없다 했다.
		// 하지만 자식 타입 객체에 부모 타입 객체를 저장하는 방법이 있다 
		
		// 부모 객체에 (Caild)라는 캐스팅 연산자를 붙히면 가능하다 하지만 이것도 조건이 있다.
		// 강아지->동물 로 변환이 되었으면 동물->강아지로만 변환이 된다.
		// 이 전에 이미 자식객체가 부모 객체로 타입 변환이 되었으면 변환된 부모 객체는 다시 자식객체로 복원될수 있다.
		// 갑자기 강아지->동물로 바꾸었는데 동물->사람으로 는 절대 불가능 하다.
		// 좁은 곳에서 넓은 곳으로 가는것은 자동으로 변환이 되지만 넓은 곳에서 작은곳으로 가려면 캐스팅 연산자 필요.
		
		// 자식 객체에서 부모 객체로 타입 변환. Caild->Parent
		Parent parent2 = new Caild();
		// 부모 객체에서 자식 객체로 강제 타입 변환. Parent->Caild
		Caild caild2 = (Caild)parent2;
		
		// (자식->부모) 부모의 필드만 사용가능 하지만 자식에 오버라이딩 메소드가 있다면 자식의 매소드 실행.
		parent2.method1();
		parent2.method2();
		
		// (부모->자식) 상속된 모든 필드 사용 가능이고 자신의 필드도 사용가능하다 .
		caild2.method1();
		caild2.method2();
		caild2.method3();

		// 부모 객체를 따로 선언 했을때는 당연히 부모가 가진 메소드를 출력한다.
		Parent parent3 = new Parent();
		parent3.method2();
	}

}















