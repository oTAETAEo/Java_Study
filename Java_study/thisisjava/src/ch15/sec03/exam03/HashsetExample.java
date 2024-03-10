package ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("asd");
		set.add("avsd");
		set.add("asv");
		set.add("avcx");
		set.add("avcv");
		
		Iterator<String> iterable = set.iterator();
		
		// Set 컬랙션 프래임워크에서 특정 값을 지우려면 이 방법 뿐이다.
		// Set에는 저장된 객체를 가져오는 메소드가 없기 때문에 있는게 확실 하다면 직접 35번줄처럼 해줄수 있지만
		// 있는지 없는지 모른다면 아래 방법으로 해야한다.
		while (iterable.hasNext()) {
			String string = iterable.next();
			System.out.println(string);
			
			if(string.equals("asd")) {
				iterable.remove();
			}
		}
		
		System.out.println();
		
		set.remove("avcv");
		
		// 이 코드는 실행이 될꺼 같지만 for문은 이미 실행 횟수를 지정을 하고 돌아가는 중에 set에 있는 size값이 변경이 되면
		// 오류가 발생한다.
//		for(String string : set) {
//			System.out.println(string);
//			if(string.equals("asv")) {
//				set.remove(string);
//			}
//		}
		
		// 고급 for문 
		for(String string : set) {
			System.out.println(string);
		}
	}

}
