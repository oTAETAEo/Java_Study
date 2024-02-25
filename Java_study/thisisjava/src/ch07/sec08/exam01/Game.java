package ch07.sec08.exam01;

public class Game {
	
	// 게임이라는 큰 틀 안에 퀘스트가 있다.
	// Quest 객채 필드 선언.
	// 이 필드에는 여러 퀘스트 객체가 온다.
	public Quest quest;
	
	// 각각의 퀘스트에 저장 되어있는 quest()  메소드를 실행시키는 메소드.
	public void questStret() {
		quest.quest();
	}
	
}
