package ch05.sec3;

public class comparison_object_Exp {

	public static void main(String[] args) {
		
		// 참조타입의 변수에는 객체의 주소가 저장된다.
		
		// int형 배열 생성
		int[] arr1;
		int[] arr2;
		int[] arr3;

		// int[] 객체를 생성해 주소 저장.
		// 배열도 객체이다.
		// 객체는 heep 영역에 생성된다.
		arr1 = new int[] {1,2,3};
		arr2 = new int[] {1,2,3};
		
		arr3 = arr2;
		
		// 객체의 비교 연산자는 객체가 가지고 있는 데이터를 비교하는 것이 아닌 객체의 번지를 비교한다.

		// false
		System.out.println(arr1 == arr2);
		
		// true
		System.out.println(arr2 == arr3);
		
	}

}
