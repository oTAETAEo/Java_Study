package ch11.sec04;

public class TreWithResorceExample {

	public static void main(String[] args) throws Exception{
		
		MyResource res1 = null;
		
		try {
			// 리소스 열기.
			 res1 = new MyResource("res1");
			// 리소스 읽기
			System.out.println(Integer.parseInt(res1.read1()));
			System.out.println(Integer.parseInt(res1.read2()));
			
		} catch (Exception e) {
			e.getMessage();
			
		} finally {
			// 리소스 닫기 (항상 실행)
			// 무조껀 닫아야 한다.
			res1.close();			
		}
		
		
		// AutoCloseable 를 상속 받았다면 close() 는 생략 가능.
		// 아래처럼 사용 하려면 클래스를 AutoCloseable 클래스를 상속 받아야함
		try (MyResource res2 = new MyResource("res2")){
			// 리소스 열기.
			// 리소스 읽기
			System.out.println(Integer.parseInt(res2.read1()));
			System.out.println(Integer.parseInt(res2.read2()));
			
		} catch (Exception e) {
			e.getMessage();
		}
		
		// 파일 여는 코드가 길다면 이렇게도 가능하다.
		// 위와 같이 close()는 생략 가능하다.
		MyResource res3 = new MyResource("res3");
		try (res3){
			// 리소스 열기.
			// 리소스 읽기
			System.out.println(Integer.parseInt(res3.read1()));
			System.out.println(Integer.parseInt(res3.read2()));
			
		} catch (Exception e) {
			e.getMessage();
		}
		
		// try() 괄호 안에 적을 객체가 많다면 밖에서 생성후 아래처럼 선언할수도 있다.
		MyResource res4 = new MyResource("res4");
		MyResource res5 = new MyResource("res5");
		try (res4;res5){
			System.out.println(Integer.parseInt(res4.read1()));
			System.out.println(Integer.parseInt(res5.read1()));
			
		} catch (Exception e) {
			e.getMessage();
		}
			
		
	}

}
