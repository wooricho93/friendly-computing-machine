interface Printable {
	public void print(String str);
}

class Printer implements Printable {
	@Override
	public void print(String str) {
		System.out.println(str);
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		Printable prn = new Printer();
		prn.print("Hello Java");
	}

}
