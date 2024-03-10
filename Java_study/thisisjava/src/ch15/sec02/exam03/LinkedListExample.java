package ch15.sec02.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<String>();
		List<String> linkedList = new LinkedList<String>();
		
		long startTime = 0;
		long endTime = 0;
		
		startTime = System.nanoTime();
		for(int i = 0; i < 1000; i++) {
			arrayList.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		System.out.printf("%-17s %8d ns \n","ArrayList 걸린 시간: " , (endTime-startTime));
		
		startTime = System.nanoTime();
		for(int i = 0; i < 1000; i++) {
			linkedList.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		
		System.out.printf("%-17s %8d ns \n","linkedList 걸린 시간: " , (endTime-startTime));
		
	}

}
