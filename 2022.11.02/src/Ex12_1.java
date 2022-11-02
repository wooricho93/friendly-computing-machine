
public class Ex12_1 {

	public static void main(String[] args) {
//		Box aBox = new Box();
//		Box oBox = new Box();
		
//		Apple a = (Apple)aBox.get(); // ob를 a에게 전달
//		Orange o = (Orange)oBox.get(); // ob를 o에게 전달
		
//		Apple a = (Apple)aBox.get();
//		Orange o = (Orange)oBox.get();
		
//		aBox.set("Apple");
//		oBox.set("Orange");
//		
//		System.out.println(aBox.get());
//		System.out.println(oBox.get());
		                                                                              
		Box<Apple> aBox = new Box();
		Box<Orange> oBox = new Box();
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		Apple a = aBox.get();
		Orange o = oBox.get();
		System.out.println(a);
		System.out.println(o);
	}

}

class Apple {
	public String toString() {
		return "I am an apple.";
	}
}

class Orange {
	public String toString() {
		return "I am an orange.";
	}
}

class Box<T> {
	private T ob;
	
	public void set(T a) {
		ob = a;
	}
	
	public T get() {
		return ob;
	}
}


