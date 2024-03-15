package ch15.sec05.exam04;

import java.util.TreeSet;

public class Comparator {

	public static void main(String[] args) {
		
		// Comparable 비구현 객체를 비교 하는 방법은 TreeSet,TreeMap을 생성할때 비교자를 제공하면 된다. new FeuitComparator()
		TreeSet<Feuit> treeSet = new TreeSet<Feuit>(new FeuitComparator());
		
		treeSet.add(new Feuit("포도", 3000));
		treeSet.add(new Feuit("수박", 10000));
		treeSet.add(new Feuit("딸기", 6000));
		
		for(Feuit feuit : treeSet) {
			System.out.println(feuit.name + " " + feuit.price);
		}
	}

}
