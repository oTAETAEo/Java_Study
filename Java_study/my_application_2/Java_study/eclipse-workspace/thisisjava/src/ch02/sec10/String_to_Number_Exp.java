package ch02.sec10;


public class String_to_Number_Exp {
	public static void main(String[] args) {
		
		
		// 문자열에 정수나 실수 문자열이 저장 되어 있으면 아래 타입 메소드로 변환해 저장할수 있다.
		
		String str1 = "10";
		String str2 = "4652";
		String str3 = "3589";
		String str4 = "16523";
		String str5 = "14.560";
		String str6 = "541.1";
		String str7 = "true";
		
		byte num1 = Byte.parseByte(str1);
		short num2 = Short.parseShort(str2);
		int num3 = Integer.parseInt(str3);
		long num4 = Long.parseLong(str4);
		float num5 = Float.parseFloat(str5);
		double num6 = Double.parseDouble(str6);
		boolean num7 = Boolean.parseBoolean(str7);
		
		// 정수나 실수 타입을 문자열로 변환 문자열 매소드.
		String str8 = String.valueOf(num6);

		System.out.println("문자열 정수나 실수 변환 메소드 타입.parseBoolean()");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		
		System.out.println("정수나 실수 문자열 변환 메소드 String.valueOf()");
		System.out.println(str8);

			
	}
}
