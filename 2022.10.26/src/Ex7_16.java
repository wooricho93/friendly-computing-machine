
interface Person1 {
	int leg = 2; // public static fanal void int leg = 2';
	void eat(); // public abstract void eat();
	void study();
}

class Student1 implements Person1 {
	public void eat() { }
	public void study() {
		System.out.println("study");
	}
}

public class Ex7_16 {

	public static void main(String[] args) {
		Person1 p = new Student1();
		
		p.study();
		
//		Person1 p2 = new Person1();
		Student1 s1 = (Student1)p;
	}

}