
public class Ex7_15 {

	public static void main(String[] args) {
		Food f1 = new Korean();
		f1.eat();
		f1 = new American();
		f1.eat();
		f1 = new EastAsian();
		f1.eat();
	}

}

abstract class Food {
	abstract void eat();
}

class Korean extends Food {
	void eat() {
		System.out.println("eat rice");
	}
}

class American extends Food {
	void eat() {
		System.out.println("eat bread");
	}
}

class EastAsian extends Food {
	void eat() {
		System.out.println("eat noodle");
	}
}

class Chinese extends Food {
	void eat() {
		
	}
}