
public class Ex12_9 {

	public static void main(String[] args) {
//		Box<String> sBox = BoxFactory.makeBox("Sweet"); // String 타입만 입력 가능
//		System.out.println(sBox.get());
//		
//		Box<Double> dBox = BoxFactory.makeBox(7.85); // Double 타입만 입력 가능
//		System.out.println(dBox.get());
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
//}
//
//class BoxFactory {
//	public static <T> Box<T> makeBox(T obj) { // 지네릭 메서드
//		Box<T> box = new Box<T>();
//		box.set(obj);
//		return box;
//	}
//}