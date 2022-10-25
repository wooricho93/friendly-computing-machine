
public class Ex7_13 {

	public static void main(String[] args) {
		Buyer b = new Buyer(); // Buyer 클래스의 기본 생성자 호출 -> 객체 생성 / 인스턴스 변수 초기화
		
		b.buy(new Tv()); // Tv t = new Tv(); b.buy(t);
		// buy(Product p) 호출
		b.buy(new Computer()); // Computer c = new Computer(); b.buy(c);
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스 점수는 " + b.bonusPoint + "만점입니다.");
	}

}

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}

class Tv extends Product {
	Tv() {
		super(100); // 조상의 생성자 호출 -> Product(100)
	}
	
	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(200); } // 조상의 생성자 호출 -> Product(200)
	
	public String toString() { return "Computer"; }
}

class Buyer {
	int money = 1000; // 소유 금액
	int bonusPoint = 0; // 현재 보너스 점수
	// Product p = new Tv(); Product p = new Computer();
	void buy(Product p) { // 매개변수가 Product 타입의 참조변수라면, 메서드의 매개변수로 Product 클래스의 자손 타입의 참조변수 대입 가능
		if (money < p.price) {
			// print() -> 매개변수에 toString()을 호출하여 문자열을 얻은 다음 출력
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
			
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다.");
	}
}