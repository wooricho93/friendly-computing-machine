
public class Ex12_6 {

	public static void main(String[] args) {
		Figure<Integer> b1 = new Figure<>();
		
		b1.set(1);
		
		Figure<Double> b2 = new Figure<>();
		b2.set(10.5);
		
//		Box<String> b3 = new Figure<>(); -> 에러; String() 타입은 Number 클래스를 상속하지 않기 때문에 지정 불가
//		b3.set("abc");
	}

}

class Figure<T extends Number> { // 숫자들의 조상을 상속하는 타입 변수 T 지정
	private T obj;
	
	void set(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return obj;
	}
}
