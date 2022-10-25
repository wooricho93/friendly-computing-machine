package test2;

public class Ex7_6 {

	public static void main(String[] args) {		
		Student s1 = new Student();
		s1.name = "김민지";
	}

}

class Person {
	String name;
	int age;
	
	Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	void method1() {}
}

class Student extends Person {
	String major;
	int studentNo;
	
	Student(String major) {
//		super();
		this.major = major;
	}
	
	public Student() {
		super();
	}
	
	void method2() {}
}