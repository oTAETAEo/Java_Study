package ch05.sec4;

public class null_and_NullPointerException {

	public static void main(String[] args) {
		
		// null_and_NullPointerException.main(null_and_NullPointerException.java:8)
		// 이라는 오류가 뜨는것을 알수 있는데 오류중 NullPointerException 문장이 보인다.
		// 오류가 나는 이유는 Null 상태의 참조변수를 사용하면 난다.
		
		// 오류 
//		String str;
//		System.out.println("str의 길이는 : " + str);
		
		// 오류 (배열도 객체이다)
//		int[] arr = null;
//		arr[0] = 1;
		
		// 정상
		String str = "Hello";
		System.out.println("str의 길이는 : " + str.length());
		
		// 정상
		int[] arr = {1,2,3};
		arr[0] = 1;
		

	}

}
