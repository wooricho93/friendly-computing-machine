package test3;

public class AbstractEX0 {

	public static void main(String[] args) {		
		Person p1 = new Person("");
		Student s1 = new Student();
	}

}

abstract class AbstractTest {
	String name;
	int age;
	
	abstract void method3();
}

class Tests extends AbstractTest {
	public int height = 100;
	
	@Override
	void method3() {
		System.out.println();
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
		super("");
	}
	
	void method2() {}
}