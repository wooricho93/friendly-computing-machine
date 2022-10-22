package wooricho;

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호(serial no)는 " + p1.serialNo + "입니다.");
		System.out.println("p2의 제품번호(serial no)는 " + p2.serialNo + "입니다.");
		System.out.println("p3의 제품번호(serial no)는 " + p3.serialNo + "입니다.");
		
		System.out.println("생산된 제품의 수는 모두 " + Product.count + "개입니다.");
	}
}

class Product {
	static int count = 0; // 클래스 변수
	int serialNo; // 인스턴스 변수
	
	{
		++count;
		serialNo = count;
	}
	
	public Product() { } // 기본 생성자(생략 가능)
	
}