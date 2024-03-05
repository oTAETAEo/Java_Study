package ch13.CheckQuestion;

public class Util {

	public static <K,V> V getValue(Pair<K, V> data1, K data2 ){
		
		if(data1.getKey().equals(data2)) {
			return data1.getValue();
		}

		return null;
				
	}
	
}
