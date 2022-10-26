
public class Ex7_22 {
	// 내부 클래스 - 인스턴스 클래스
	public static void main(String[] args) {
		Outer2 o1 = new Outer2();
		Outer2 o2 = new Outer2();
		
		Outer2.Member m1 = o1.new Member();
		Outer2.Member m2 = o2.new Member();
		
		m1.add(5);
		System.out.println(m1.get());
		m2.add(6);
		System.out.println(m2.get());
	}

}

class Outer2 {
	private int num = 0;
	
	class Member { // 인스턴스 클래스(=멤버 클래스)
		void add(int n) {
			num += n;
		}
		int get() { return num; }
	}
}