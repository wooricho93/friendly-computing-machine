package test;

public class Ex7_6 {

	public static void main(String[] args) {		
		Student s1 = new Student();
		s1.name = "김민지";
	}

}

class Person {
	String name;
	int age;
	
	public Person(String name) {
		this.name = name;
	}
	
	void method1() {}
}

class Student extends Person {
	String major;
	int studentNo;
	
	public Student() {
		super("김민지");
	}
	
	void method2() {}
}