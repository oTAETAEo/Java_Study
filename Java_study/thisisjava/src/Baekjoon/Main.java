package Baekjoon;

import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		TreeMap<String, String> map = new TreeMap<String, String>();
		
		int num = scanner.nextInt();
		
		for(int i = 0; i < num; i++) {
			
			String str1 = scanner.next();
			String str2 = scanner.next();
			if(map.containsKey(str1)) {
				map.remove(str1);
			}else {
				map.put(str1, str2);
			}
		}
		
		NavigableSet<String> map2 = map.descendingKeySet();
		
		for(String string : map2) {
			System.out.println(string);
		}
	}
}

