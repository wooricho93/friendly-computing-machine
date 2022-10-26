
class Person {
	String name;
	int age;
	static int leg = 2;
	
	static void eat() {
		System.out.println("eat");
	}
	
	void study() {}
}

class Student extends Person {
	String major;
	int studentNo;
	
	void study() {
		System.out.println("study");
	}
}

public class Ex7_14 {

	public static void main(String[] args) {
		Person p = new Student();
		
		p.study();
		
		Person p2 = new Person();
		Student s1 = (Student)p;
	}

}