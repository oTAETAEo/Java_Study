package ch13.sec02;

// 타입 파라미터 자리에 오는 참조 객체들의 타입은 K는 K 자리로 M은 M자리로 간다.
public class Product<K,M> {

	private K kind;
	private M model;
	
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
}
