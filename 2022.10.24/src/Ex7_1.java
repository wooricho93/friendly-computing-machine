
public class Ex7_1 {

	public static void main(String[] args) {
		Person p1 = new Person("김철", 26);
		System.out.println(p1.name + ", " + p1.age);
		
		Person p2 = new Student(); // 상위 클래스는 하위 클래스 참조 가능
		
		Student s1 = new Student("홍길동", 20, "컴퓨터공학과", 202212394);
		System.out.println(s1.name + ", " + s1.age + ", " + s1.major + ", " + s1.no);
		
		Student s2 = new Student("문헌정보학과", 202120301);
		s2.name = "가나다";
		s2.age = 21;
		System.out.println(s2.major + ", " + s2.no);
		System.out.println(s2.name + ", " + s2.age + ", " + s2.major + ", " + s2.no);
		
		Athlete a1 = new Athlete("김희진", 32, "배구");
		System.out.println(a1.name + ", " + a1.age);
		
		WorkStudent ws1 = new WorkStudent("홍길동", 20, "컴퓨터공학과", 202212394, "문서작업");
		System.out.println(ws1.name);
		
//		WorkStudent ws2 = new Person(); -> 하위 클래스는 상위 클래스 참조 불가
	}

}

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
//		super(); -> 컴파일러에 의해 자동으로 추가
		this.name = name;
		this.age = age;
	}

}

class Student extends Person {
	String major;
	int no;
	
	public Student() {
		this(null, 0, null, 0);
	}
	
	Student(String major, int no) {
		this(null, 0, major, no); // this() 생성자를 호출하여 super()가 자동으로 생성되는 것을 방지
	}
	
	Student(String name, int age, String major, int no) {
		super(name, age); // 조상의 멤버를 초기화하기 위해 상위 클래스의 생성자를 호출
		this.major = major;
		this.no = no;
	}
	
}

class WorkStudent extends Student {
	String job;
	
	WorkStudent(String name, int age, String major, int no, String job) {
		super(name, age, major, no);
		this.job = job;
	}
	
}

class Athlete extends Person {
	String sports;
	
	Athlete() { // 기본 생성자
		this(null, 0, null);
	}
	
	public Athlete(String name, int age, String sports) {
		super(name, age);
		this.sports = sports;
	}
	
}
