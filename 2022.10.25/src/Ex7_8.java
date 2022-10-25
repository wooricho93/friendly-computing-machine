
public class Ex7_8 {

	public static void main(String[] args) {
		Person1 p1 = new Person1();
		p1.work();
		
		p1 = new OfficeJob();
		p1.work();
		
		p1 = new Student1();
		p1.work();
		
		p1 = new Athlete();
		p1.work();
		p1.run(); // Athlete 클래스에는 존재하지만 Person1 클래스에 정의되어 있지 않으므로 접근 불가
	}

}

class Person1 {
	private String name;
	private int age;
	
	void work() { System.out.println("work"); }
	
//	void run() {}
}

class Student1 extends Person1 {
	void work() { System.out.println("study"); }
}

class Athlete extends Person1 {
	void work() { System.out.println("training"); }
	void run() { System.out.println("run"); }
}

class OfficeJob extends Person1 {
	void work() { System.out.println("work inside"); }
}

class Worker extends Person1 {
	void work() { System.out.println("work outside"); }
}