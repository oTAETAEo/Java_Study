package ch15.sec05.exam04;

import java.util.Comparator;

// 비교자. 
public class FeuitComparator implements Comparator<Feuit>{
	
	// 비교할 기준을 정해 정렬을 하기위한 compare메소드 재정의.
	@Override
	public int compare(Feuit o1, Feuit o2) {
		if(o1.price < o2.price) return -1;
		else if(o1.price > o2.price) return 1;
		else return 0;
	}

}
