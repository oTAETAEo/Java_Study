package ch07.sec08.exam01;

public class Wizard extends Quest{

	// 퀘스트 종류에는 마법사 캐릭터의 퀘스트가 있으니 부모로 Quest를 상속 받아 quest() 메소드를 마법사 퀘스트로 오버라이딩.
	
	@Override
	public void quest() {
		super.quest();
		System.out.println("마법사 캐릭터의 퀘스트");	
	}
	
	
}
