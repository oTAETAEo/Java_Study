package Baekjoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String string = " ";
		
		while(!(string == null)) {			
			Scanner scanner = new Scanner(System.in);
			string = scanner.nextLine();
			System.out.println(string);	
		}
	}
}
