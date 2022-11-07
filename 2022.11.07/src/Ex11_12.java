import java.util.Arrays;

class Person implements Comparable {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ", " + age;
	}

	@Override
	public int compareTo(Object o) { // 나이 오름차순으로 정렬
		Person p = (Person)o;
//		if(this.age > p.age)
//			return 1;
//		else if (this.age < p.age)
//			return -1;
//		else
//			return 0;
		return this.age - p.age;
	}
}

public class Ex11_12 {

	public static void main(String[] args) {
		Person[] p1 = new Person[3];
		
		p1[0] = new Person("강감찬", 50);
		p1[1] = new Person("홍길동", 25);
		p1[2] = new Person("성춘향", 20);
		
		Arrays.sort(p1);
		
		for(Person p : p1)
			System.out.println(p);
	}

}
