
public class Ex7_9 {

	public static void main(String[] args) {
		Person2 p = new Person2();
		p = new Student2();
		p = new WorkStudent();
		
		
		
		Student2 s = new Student2();
		s = new WorkStudent();
//		s = new Person(); -> 하위 클래스에서 상위 클래스 참조 불가능
		
		s = (Student2)p;
		
		

		
		WorkStudent ws = new WorkStudent();
//		ws = new Student2();
//		ws = new Person2();
	}

}

class Person2 {
	private String name;
	private int age;
	
	void eat() { System.out.println("eat"); }
	
//	void run() {}
}

class Student2 extends Person2 {
	void study() { System.out.println("study"); }
}

class WorkStudent extends Student2 {
	void work() { System.out.println("work"); }
}