class Man {
	String name;
	
	public Man(String name) {
		this.name = name;
	}
	
	Man() {}
	
	public void tellYourName() {
		System.out.println("My name is " + name + ".");
	}
}

class BusinessMan extends Man {
	String company;
	String position;
	
	public BusinessMan(String company, String position) {
		this.company = company;
		this.position = position;
	}
	
	public void tellYourInfo() {
		System.out.println("My company is " + company + ".");
		System.out.println("My position is " + position + ".");
		tellYourName();
	}
}

public class InheritanceTest {

	public static void main(String[] args) {
		BusinessMan bm = new BusinessMan("Ezen", "Human Resource");
		bm.name = "Sarah";
		bm.tellYourInfo();
	}

}
