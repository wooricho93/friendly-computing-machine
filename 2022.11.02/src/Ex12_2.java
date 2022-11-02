import java.util.ArrayList;

class Fruit {
	public String toString() {
		return "Fruit";
	}
}

class Peach extends Fruit {
	public String toString() {
		return "Peach";
	}
}

class Grape extends Fruit {
	public String toString() {
		return "Grape";
	}
}

class Toy {
	public String toString() {
		return "Toy";
	}
}

public class Ex12_2 {

	public static void main(String[] args) {
		myBox<Fruit> fruitBox = new myBox<Fruit>();
		myBox<Peach> peachBox = new myBox<Peach>();
		myBox<Toy> toyBox = new myBox<Toy>();
//		myBox<Grape> grapeBox = new myBox<Apple>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Peach());
		
		peachBox.add(new Peach());
		peachBox.add(new Peach());
//		appleBox.add(new toy());
		
		toyBox.add(new Toy());
//		toyBox.add(new Apple());
		
		System.out.println(fruitBox);
		System.out.println(peachBox);
		System.out.println(toyBox);
	}

}

class myBox<T> {
	ArrayList<T> list = new ArrayList<T>();
	
	void add(T item) {
		list.add(item);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}
}