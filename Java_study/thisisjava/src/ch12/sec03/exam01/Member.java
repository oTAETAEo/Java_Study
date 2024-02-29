package ch12.sec03.exam01;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	// 동등비교를 사용하고 싶으면 재정의 해라.
	// 객체 주소를 비교를 하는 equals를 재정의 해서 리터럴 값이 같다면
	// 동등하다고 리턴 해준다.
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			// 문자열의 equals는 리터럴을 비교한다.
			if(id.equals(target.id)) {
				return true;
			}
		}
		return false;
	}
}
