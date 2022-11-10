import java.util.ArrayList;

class Fruit {
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit {
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit {
	public String toString() {
		return "Grape";
	}
}

//class Toy {
//	public String toString() {
//		return "Toy";
//	}
//}

public class Ex12_8 {

	public static void main(String[] args) {
//		Box<Fruit> fruitBox = new Box<Fruit>();
//		Box<Apple> appleBox = new Box<Apple>();
//		Box<Toy> toyBox = new Box<Toy>();
////		Box<Grape> grapeBox = new Box<Apple>(); -> 에러; 참조변수와 생성자에 대입된 타입은 일치해야 함
//		
//		fruitBox.add(new Fruit());
//		// 다형성: 조상 타입의 참조 변수로 자손 타입의 객체를 다룰 수 있다.
//		fruitBox.add(new Apple()); // add()의 매개변수로 Fruit와 그 자손 클래스들 대입 가능
//		
//		appleBox.add(new Apple());
//		appleBox.add(new Apple());
////		appleBox.add(new Toy()); -> 에러; Box<Apple>에는 Apple 타입만 담을 수 있음
//		
//		toyBox.add(new Toy());
////		toyBox.add(new Apple); -> 에러; Box<Toy>에는 Toy 타입만 담을 수 있음
//		
//		System.out.println(fruitBox);
//		System.out.println(appleBox);
//		System.out.println(toyBox);
	}

}

//class Box<T> {
//	ArrayList<T> list = new ArrayList<T>();
//	
//	void add(T item) {
//		list.add(item);
//	}
//	
//	T get(int i) {
//		return list.get(i);
//	}
//	
//	int size() {
//		return list.size();
//	}
//	
//	public String toString() {
//		return list.toString();
//	}
//}