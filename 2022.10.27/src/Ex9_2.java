
public class Ex9_2 {

	public static void main(String[] args) {
		Person p1 = new Person(80110811112L);
		Person p2 = new Person(80110811112L);
		String p3 = "80110811112L";
		
		if (p1 == p2) {
			System.out.println("p1과 p2는 같은 사람입니다.");
		} else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
		
		if (p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 사람입니다.");
		} else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
		
		if (p1.equals(p3)) {
			System.out.println("----------------------------");
		}
		System.out.println(p1.toString());
	}

}

class Person {
	long id;
	
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			return id == ((Person)obj).id;
		} else {
			return false;
		}
	}
	
	Person(long id) {
		this.id = id;
	}
	
	public String toString() {
		return id + "";
	}
}