
public class Ex7_11 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; // 형변환 생략 가능; 자손 타입 -> 조상 타입
//		car.water();
		fe2 = (FireEngine)car; // 형변환 생략 불가; 조상 타입 -> 자손 타입
		fe2.water();
		
	}

}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive");
	}
	
	void stop() {
		System.out.println("stop");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water");
	}
}