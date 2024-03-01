package ch12.sec05;

import java.util.Arrays;

public class BytesToStringExample{

	public static void main(String[] args) throws Exception{
		
		String data = "자바";
		
		// 문자열을 바이트 배열로.
		byte[] arr1 = data.getBytes();
		System.out.println("arr1: " + Arrays.toString(arr1));
		
		// 바이트 배열을 문자열로 복원.
		String str1 = new String(arr1);
		System.out.println(str1);
		
		// 한글을 인코딩 하는 방법을 같게 해야지 한글이 깨지지 않고 복원 된다.
		// 문자 셋 부분에 이상한 값이 들어가면 예외가 발생한다.
		byte[] arr2 = data.getBytes("EUC-KR");
		System.out.println("arr2: " + Arrays.toString(arr2));
		String str2 = new String(arr2,"EUC-KR");
		System.out.println(str2);
		
		// 운영체제의 문자열 인코딩 디폴트 값을 가져온다.
		String str = System.getProperty("stderr.encoding");
		
		String data1 = "최태현";
		byte[] arr3 = data1.getBytes(str);
		String str3 = new String(arr3,str);
		System.out.println(str3);
		
		
	}

}
