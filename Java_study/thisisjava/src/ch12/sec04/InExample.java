package ch12.sec04;

public class InExample {

	public static void main(String[] args) throws Exception{
		
		int speed = 0;
		int keyCode = 0;
		
		while (true) {
			
			if(keyCode != 13 && keyCode != 10) {
				if(keyCode == 49) {
					speed++;
				} else if(keyCode == 50){
					speed--;
				}else if(keyCode == 51) {
					break;
				}
				
				System.out.println("-------------------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("-------------------------");
				System.out.println("현재속도: " + speed);
				System.out.println("선택");
			}
			// 한번에 하나씩 읽는다 입력 값으로 "1111"이 입력 되면 총 4번 돈다. 
			keyCode = System.in.read();
			
		}
		
		System.out.println("프로그램 종료");
	}

}
