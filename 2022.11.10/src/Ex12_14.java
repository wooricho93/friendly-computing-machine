// 하한 제한(T와 그 조상들만 가능)
public class Ex12_14 {

	public static void main(String[] args) {
//		Box<Integer> iBox = new Box<>();
//		iBox.set(20);
//		UnBoxer.peekBox(iBox);
//// Integer와 Double은 상속 관계가 아니기 때문에 형변환 제한 불가
////		Box<Double> dBox = new Box<>();
////		dBox.set(12.5);
////		UnBoxer.peekBox(dBox);
//// Integer와 그 조상은 타입 매개변수로 사용 가능. Object 클래스는 모든 클래스들의 조상이므로 자손 클래스 타입을 매개변수로 할 수 있다.
//// 상위 클래스를 매개로 하여 다른 타입의 클래스를 타입 매개변수로 사용할 수 있다.
//		Box<Object> oBox = new Box<>();
//		oBox.set("Sweet");
//		UnBoxer.peekBox(oBox);
	}
}


//class Box<T> {
//	private T obj;
//	
//	public void set(T obj) {
//		this.obj = obj;
//	}
//	
//	public T get() {
//		return obj;
//	}
//	
//	public String toString() {
//		return obj.toString();
//	}
//}
//
//class UnBoxer {
//	public static void peekBox(Box<? super Integer> box) {
//		System.out.println(box);
//	}
//}
