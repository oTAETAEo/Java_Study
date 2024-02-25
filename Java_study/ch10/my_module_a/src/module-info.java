/**
 * 
 */
/**
 * 
 */
module my_module_a {
	
	// 패키지 은닉 하는 방법은 exports를 하지 않는것이다.
	// 은닉 하는 이유는 사용방법을 특정 패키지로 특정하도록 하기 위함.
	// 쉬운 수정을 위해 사용한다. 성능 향상을 위해 패키지 2,3을 수정하여도
	// 모듈의 사용 방법인 패키지1 은 달라지지 않기 때문에 외부에 영향을 주지 않는다.
	exports pack1;
	//exports pack2;
	
	// transitive 는 전이라는 뜻 
	requires transitive my_module_b;
}