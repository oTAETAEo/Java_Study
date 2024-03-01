/**
 * 
 */
/**
 * 
 */
// module dkvdp opens가 붙으면 은닉 패키기여도 리플랙션이 가능하다.
module my_module_b {
	
	// 간단하게 리플랙션 설정 방법은 
	// exports 된 패키지는 언제든지 리플렉션 할수 있기 때문에 opens를 할 필요 없다.
	// opens 패키지명 은 그 패키지를 리플랙션을 허용 한다는 뜻이다.
	// opens 패키지명 to 패키지명 ... 은 지정된 패키지의 특정 외부 모듈에서만 리플랙션을 허용한다.
	exports pack3;
	exports pack4;
	
}
