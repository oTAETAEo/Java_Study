package ch12.sec11.exam03;

public class GetResorceExample {

	public static void main(String[] args) {
		
		Class clazz = Car.class;
		
		// 클래스 파일의 경로 위치로 이경로를 기준으로 상대 경로에 있는 다른 리소스 파일의 정보를 얻을수 있다.
		// 이미지,XML,Property파일
		
		// 출력되는 경로는 절대경로이다.
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}
}
