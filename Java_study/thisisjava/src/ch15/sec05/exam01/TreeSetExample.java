package ch15.sec05.exam01;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<Integer> scores = new TreeSet<Integer>();
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		for(int num : scores) {
			System.out.printf(num + " ");
		}
		
		System.out.println("\n");
		
		System.out.println("가장 낮은 점수: " + scores.first());
		System.out.println("가장 높은 점수: " + scores.last());
		System.out.println("95점 아래 점수: " + scores.lower(95));
		System.out.println("95점 위에 점수: " + scores.higher(95));
		System.out.println("95점이거나 바로 아래 점수: " + scores.floor(95));
		System.out.println("85점이거나 바로 위의 점수: " + scores.ceiling(85));
		
		System.out.println();

		// 내림차순 반복자를 얻는 방법.
		NavigableSet<Integer> descendingScores = scores.descendingSet();
		for(int num : descendingScores) {
			System.out.printf(num + " ");
		}
		
		System.out.println();

		// 80을 포함한 위의 숫자. 
		NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
		for(int num : rangeSet) {
			System.out.printf(num + " ");
		}

		System.out.println();

		// 80을 포함하고 90을 포함하지 않은 사이 숫자. 
		rangeSet = scores.subSet(80, true, 90, false);
		for(int num : rangeSet) {
			System.out.printf(num + " ");
		}
	}

}
