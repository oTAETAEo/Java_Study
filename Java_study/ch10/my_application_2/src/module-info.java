/**
 * 
 */
/**
 * 
 */
module my_application_2 {
	
	// 집합 모듈을 사용해 각각 requires 하지 않고 하나의 모듈만 사용한다.
	// 빌드 패스에 집합 모듈을 사용할 경우 집합 모듈에 있는 모듈 경로도 Class Path
	// 위치에 있어야 한다. 모듈의 이름만 가져올 뿐 실질적인것은 설정을 해주어야 함.
	requires my_module;
	
	// 같다.
//	requires my_module_a;
//	requires my_module_b;
}