
public class Ex7_5 {
	// 변수의 연결에 관한 문제 -> 생성자의 호출 순서 인지
	public static void main(String[] args) {
		Child c = new Child(); // Child 클래스의 기본 생성자 호
		System.out.println("x = " + c.getX());
	}
}

class Parent {
	int x = 100;
	                                                                                                                                      
	Parent() { // Parent 클래스의 기본 생성자
		this(200); // 같은 클래스의 다른 생성자 호출
		System.out.println("1");
	}
	
	Parent(int x) { // 매개변수가 있는Parent 클래스의 생성자
//		super(); // 최고 조상 Object 클래스의 기본 생성자 호출
		this.x = x; // this.x = 200
		System.out.println("2");
	}
	
	int getX() {
		return x; // x = this.x -> Parent의 x
	}
}

class Child extends Parent {
	int x = 3000;
	
	Child() { // Child 클래스의 기본 생성자
		this(1000); // 같은 클래스의 다른 생성자 호출
		System.out.println("3");
	}
	
	Child(int x) { // 매개변수가 있는 Child 클래스의 생성자
//		super(); -> Parent 클래스의 기본 생성자 호출
		this.x = x;
		System.out.println("4");
	}
	
//	int getX() {
//		return x; // x = this.x -> Child의 x
//	}
}
