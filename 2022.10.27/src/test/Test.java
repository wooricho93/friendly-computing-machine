package test;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Computer());
		b.summary();
	}

}

class Product {
	int price;
	
	Product(int price) {
		this.price = price;
	}
	
	Product() {}
	
}

class Tv extends Product {
	Tv() {
		super(100);
	}
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Buyer {
	int money = 2000;
	int sum;
	Product[] cart = new Product[10];
	int i = 0;
	
	void buy(Product p) {
		if (money < p.price) {
			return;
		}
		
		money -= p.price;
		sum += p.price;
		add(p);
		
	}
	
	void add(Product p) {
		if (cart.length <= i) {
			Product[] cart2 = new Product[cart.length * 2];
			System.arraycopy(cart, 0, cart2, 0, cart.length);
			cart = cart2;
		} else {
			cart[i++] = p;
		}
		
}
	
	void summary() {
		String cartBasket= "";
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null) break;
			cartBasket += cart[i] + ", ";
		}
		
		System.out.println("구입한 물건: " + cartBasket);
		System.out.println("사용하신 금액은 " + sum + "원입니다.");
		System.out.println("남은 금액은 " + money + "원입니다.");
	}
}