/**
 * 
 */
/**
 * 
 */

// 의존 모듈 설정. 
// 의돈 모듈은 패키지나 클래스는 가지지 않는다 오로지
// requires transitive 모듈명 만을 가진다.
module my_module {
	requires transitive my_module_a;
	requires transitive my_module_b;

}