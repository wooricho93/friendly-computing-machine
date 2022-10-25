
public class Ex7_6 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("김민지");
		p1.setAge(140);
		
		Student s1 = new Student();
		s1.setName("김지민");
		s1.setAge(-20);
	}

}

class Person {
	private String name;
	private int age;
	
	void setName(String name) {
		this.name = name;
	}
	
	void setAge(int age) {
		if (age < 0 || age > 120) {
			System.out.println(name + "님의 나이를 잘못 입력하셨습니다.");
		}
		this.age = age;
	}
	
	void method1() {
		
	}
}

class Student extends Person {
	String major;
	int studentNo;
	
	void method2() {
		
	}
}