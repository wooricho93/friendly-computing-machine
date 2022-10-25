
public class Ex7_7 {

	public static void main(String[] args) {
		SingletonTest s = new SingletonTest();
		s.method1();
	}

}

class SingletonTest {
	int age;
	
	private SingletonTest() { // 객체 생성 불가
		
	}
	
	void method1() {
		System.out.println("=============================");
	}
}