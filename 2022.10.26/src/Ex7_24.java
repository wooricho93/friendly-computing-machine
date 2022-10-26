
public class Ex7_24 {
	// 익명 클래스
	public static void main(String[] args) {
		Paper p = new Paper("익명 클래스 테스트");
		Printerable pri = p.getPrinter();
		pri.print();
	}

}

interface Printerable {
	void print();
}

class Paper {
	private String con;
	public Paper(String s) {
		con = s;
	}
	public Printerable getPrinter() {
		return new Printerable() {
			public void print() {
				System.out.println(con);
			}
		};
	}
}