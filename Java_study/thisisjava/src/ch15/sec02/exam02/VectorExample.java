package ch15.sec02.exam02;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		// Vector 클래스는 멀티 쓰레드 환경에서 안전하게 사용할 수 있는 컬렉션이라고 한다.
		// 멀티 스레드 환경에서 백터를 공유 객체로 사용해야 안정적이다 
		// 백터에있는 모든 메소드는 synchronized 동기화된 메소드이기 때문이다.  
		
		List<Board> list = new Vector<Board>();
		
		Thread threadA = new Thread() {
			@Override
			public void run() {
				
				for(int i = 1; i <= 1000; i++) {
					list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};
		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				
				for(int i = 1001; i <= 2000; i++) {
					list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};
		
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
		}

		int size = list.size();
		System.out.println("총 개수: " + size);
		System.out.println();
		
	}

}
