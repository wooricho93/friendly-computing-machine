
public class Ex7_21 {
	// 내부 클래스 - static 클래스
	public static void main(String[] args) {
		Outer.Nested1 n1 = new Outer.Nested1();
		n1.add(5);
		n1.add(3);
		
		Outer.Nested2 n2 = new Outer.Nested2();
		System.out.println(n2.get());
	}

}

class Outer {
	private static int num = 0;
	
	static class Nested1 {
		void add(int n) {
			num += n;
		}
	}
	
	static class Nested2 {
		int get() { return num; }
	}
}