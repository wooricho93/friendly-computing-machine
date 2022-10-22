package wooricho;

public class InheritanceEx {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "김이박";
		p1.age = 33;
		
		System.out.println(p1.name + ", " + p1.age);
		
		Student s1 = new Student();
		s1.name = "박이김";
		s1.age = 20;
		s1.no = 202258940;
		s1.major = "경영학과";
		
		System.out.println(s1.name + ", " + s1.age + ", " + s1.no + ", " + s1.major);
	}

}

class Person {
	String name;
	int age;
	
	Person() {
		System.out.println("Person");
	}
}

class Student extends Person {
	int no; // 학번
	String major;
	
	Student() {
		System.out.println("Student");
	}
}