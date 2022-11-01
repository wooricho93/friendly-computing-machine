import java.awt.print.Printable;

interface Printable2 {
	public void print(String str);
}

class SPrinterDriver implements Printable2 {
	@Override
	public void print(String str) {
		System.out.println("From Samsung Printer");
		System.out.println(str);
	}
}

class LPrinterDriver implements Printable2 {
	@Override
	public void print(String str) {
		System.out.println("From LG Printer");
		System.out.println(str);
	}
}

public class InterfaceTest2 {

	public static void main(String[] args) {
		String myDoc = "This is a report about ";
		
		Printable2 prn = new SPrinterDriver();
		prn.print(myDoc);
		System.out.println();
		
		prn = new LPrinterDriver();
		prn.print(myDoc);
	}

}
