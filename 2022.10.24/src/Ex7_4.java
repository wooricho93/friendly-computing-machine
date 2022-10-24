
public class Ex7_4 {

	public static void main(String[] args) {
		Tv t = new Tv();
	}

}

class Product {
	int price;
	int bonusPoint;
	
	Product() {}
	
	Product (int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product {
	Tv() {
		super(2000000);
	}
	
	public String toString() {
		return "Tv";
	}
	
}
