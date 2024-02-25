package ch07.sec08.exam02;

public class Gamer {
	
	
	// 메소드의 매게변수에는 객체가 올수있다.
		
	// 다형성은 필드 보다는 메소드를 호출할때 많이 사용된다 일반 메소드와 같이
	// 매개변수가 Quest라는 객체 매게변수이면 Quest 객체를 매개값으로 주는게 정석 이지만
	// Quest라는 객체의 자식 객체도 올수 있다 
	
	// 같은 클래스의 객체를 주는것도 되고 매개변수에 있는 클래스를 부모로 가지는 클래스도 올수 있다.
	
	// questStart() 메소드의 매개값으로는 객체를 주었다 여기에는 Quest를 부모로 가지고 있는
	// 자식 객체도 올수 있다 이것이 다형성이다.
	
	// 어느 캐릭터의 퀘스트를 가져올지 매개변수로 준다.
	public void questStart(Quest quest) {
		quest.CharacterQuest();
	}
	
}
