package ch17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {

	public static void main(String[] args) {

		// 띄어쓰기를 기준으로 나누어진 문자열을 출력.
		List<String> list1 = new ArrayList<String>();
		list1.add("this is java");
		list1.add("i am a best developer");
		list1.stream()
		.flatMap(t -> Arrays.stream(t.split(" "))) // split 메서드는 매개값에 나눌 기준을 넣어주면 잘린 단어 순으로 배열을 리턴한다.
		.forEach(t -> System.out.println(t));
		
		System.out.println();
		
		List<String> list2 = Arrays.asList("10, 20, 30","40, 50"); // Arrays.asList 새로운 원소 추가 삭제 불가. 추가 삭게 하려는 작업를 하면 실행예ㄴ    외가 발생한다.
		list2.stream()
		.flatMapToInt(t -> {
			String[] strArr = t.split(",");
			int[] num = new int[strArr.length];
			for(int i = 0; i < strArr.length; i++) {
				num[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(num);
		})
		.forEach(value -> System.out.println(value));
		
		
	}

}
