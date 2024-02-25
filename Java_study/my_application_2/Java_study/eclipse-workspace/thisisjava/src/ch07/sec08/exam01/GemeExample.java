package ch07.sec08.exam01;

public class GemeExample {

	public static void main(String[] args) {
		
		// 부모 객체 선언
		Game myGame = new Game();
		
		// myGame.quest
		// 규격 Quest 객체 장착.
		myGame.quest = new Quest();
		myGame.questStret();
		
		System.out.println();
		
		// 모험가 퀘스트 객체 장착
		myGame.quest = new Adventurer();
		myGame.questStret();
		
		// 마법사 퀘스트 객체 장착
		myGame.quest = new Wizard();
		myGame.questStret();
	}

}
