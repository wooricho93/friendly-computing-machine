
public class Ex12_7 {

	public static void main(String[] args) {
		Box<Fruit> b = new Box<>();
		
		b.set(new Apple());
		Apple a = (Apple)b.get();
		System.out.println(a);
		
		b.set(new Orange());
		Orange o = (Orange)b.get();
		System.out.println(o);
		
//		b.set(new Person()); -> 에러; Fruit 클래스를 상속하고 있는 클래스만 타입을 지정할 수 있음
	}

}

class Fruit { // Apple과 Orange의 공통 조상인 Fruit 클래스를 생성
	
}

class Apple extends Fruit {
	public String toString() {
		return "I am an Apple.";
	}
}

class Orange extends Fruit {
	public String toString() {
		return "I am an Orange.";
	}
}

class Box<T extends Fruit> { // 타입 매개변수 T가 Fruit를 상속하면,Fruit와 그 자손들만 타입 매개변수가 될 수 있음
	private T f;
	
	void set(T f) {
		this.f = f;
	}
	
	T get() {
		return f;
	}
}

class Person {
	public String toString() {
		return "I am a Person.";
	}
}