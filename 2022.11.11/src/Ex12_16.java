
public class Ex12_16 {

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
	public static void outBox(Box<? extends Toy> box) {
		Toy t = box.get();
//	box에는 Toy 클래스와 Toy 클래스를 상속한 클래스가 올 수 있는데, 현재 box의 타입이 Toy인지 그 자손인지 알 수 없기 때문에 최고 조상인 Toy의 객체를
//	다룰 수 없다. (자손 타입의 참조 변수는 조상의 객체를 가리킬 수 X)
//	box.set(new Toy()); -> 에러
		System.out.println(t);
	}
	
	public static void inBox(Box<Toy> box, Toy t) {
		box.set(t);
	}
}