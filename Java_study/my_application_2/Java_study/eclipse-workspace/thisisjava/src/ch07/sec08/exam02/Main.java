package ch07.sec08.exam02;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer = new Gamer();
		
		// gamer 클래스에 있는 questStart() 메소드에는 객체형태인 매개값이 필요하다.
		// 이 매개변수에는 Quest 클래스를 부모로 하는 자식 클래스 WarriorQuest를 
		// new 키워드로 객체를 만들어 매개값으로 전달한다.
		
		WarriorQuest warriorQuest = new WarriorQuest();
		
		gamer.questStart(warriorQuest);
		gamer.questStart(new WizardQuest());
		
		Quest quest = new WarriorQuest();
		
		
		// 객체 타입 확인 instanceof
		// 부모 객체로 형변환한 자식 객체가 WarriorQuest이냐 아니냐를 boolean 타입으로 리턴.
		boolean result1 = quest instanceof WarriorQuest;
		System.out.println(result1);
		
		boolean result2 = quest instanceof WizardQuest;
		System.out.println(result2);
		
		// 자식 객체가 생성 될때 부모 객체도 같이 생성되기 때문에 true다.
		boolean result3 = warriorQuest instanceof Quest;
		System.out.println(result3);
		
		// 사용하는 경우는 내가 매소드의 매개변수를 부모 클래스 객체로 해놓았는데 여기에는
		// 부모 객체 자식 객체가 올수있다는 점이다 하지만 여기서 부모가 온건지 자식이 온건지는
		// 모르기 때문에 만약 자식 클래스에서만 실행할수 있는 매소드가 있다면 타입 변환을 해서
		// 사용해야 하기 때문에 사용한다.
		// instanceof 가 나오면 객체의 타입을 검사 한다라는 코드.
		

		
	}

}
