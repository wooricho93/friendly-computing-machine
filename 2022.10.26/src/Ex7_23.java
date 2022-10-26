
public class Ex7_23 {
	// 내부 클래스 - 지역 클래스
	public static void main(String[] args) {
		Papers p = new Papers("지역 클래스 테스트");
		Printable pri = p.getPrinter();
		pri.print();
	}

}

interface Printable {
	void print();
}

class Papers {
	private String con;
	public Papers(String s) {
		con = s;
	}
	public Printable getPrinter() {
		class Printer implements Printable { // Printer 클래스 정의
			public void print() {
				System.out.println(con);
			}
		}
		return new Printer(); // Printer 클래스 생성
	}
}