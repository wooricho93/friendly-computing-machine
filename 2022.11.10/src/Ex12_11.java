
public class Ex12_11 {

	public static void main(String[] args) {
//		Box<Integer> iBox = BoxFactory.makeBox(new Integer(8888));
//		int n = UnBoxer.openBox(iBox);
//		System.out.println("Returned data: " + n);
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
//	public static <T extends Number> Box<T> makeBox(T obj) {
//		Box<T> box = new Box<T>();
//		box.set(obj);
//		System.out.println("Boxed data: " + obj.intValue());
//		return box;
//	}
//}
//
//class UnBoxer {
//	public static <T extends Number> T openBox(Box<T> box) {
//		System.out.println("Unboxed data: " + box.get().intValue());
//		return box.get();
//	}
//}
