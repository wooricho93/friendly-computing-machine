
public class Ex12_17 {
	public static void main(String[] args) {
		Box<Toy> box = new Box<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);
	}
}


class Box<T> {
	private T obj;
	
	public void set(T obj) {
		this.obj = obj;
	}
	
	public T get() {
		return obj;
	}
	
	public String toString() {
		return obj.toString();
	}
}

class Toy {
	public String toString() {
		return "Toy";
	}
}

class BoxHandler {
	public static void outBox(Box<? super Toy> box) {
//		Toy t = box.get();
		box.set(new Toy());
//		System.out.println(t);
	}
	
	public static void inBox(Box<Toy> box, Toy t) {
		box.set(t);
	}
}
