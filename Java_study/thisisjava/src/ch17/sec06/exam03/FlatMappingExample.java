package ch17.sec06.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingExample {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		list1.add("this is java");
		list1.add("i am a best developer");
		list1.stream()
		.flatMap(t -> Arrays.stream(t.split(" ")))
		.forEach(t -> System.out.println(t));
		
		System.out.println();
		
		List<String> list2 = Arrays.asList("10, 20, 30","40, 50"); // Arrays.asList 새로운 원소 추가 삭제 불가. 추가 삭게 하려는 작업를 하면 실행예ㄴ외가 발생한다.
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
