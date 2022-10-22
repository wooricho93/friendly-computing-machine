package wooricho;

public class CatProject {

	public static void main(String[] args) {
		Cat c1 = new Cat("야홍", 3);
		System.out.println(c1);
		c1.character("사나운");
		
		Cat c2 = new Cat("뽀양", 4, false, 3.2);
		System.out.println(c2);
		c2.character("평온한");
		
		Cat c3 = new Cat("강산", 1, false, 3.5);
		System.out.println(c3.toString());
		c3.sleep(5);
		
		Cat c4 = new Cat(c3);
		System.out.println(c4);
		
		System.out.println("-----------------------");
		
		c4.age = 2;
		System.out.println(c3);
		System.out.println(c4);
		
		
	}

}


class Cat {
	String name;
	static String servant = "김대철";
	int age;
	boolean sex;
	double weight;
	
	Cat() {}
	
	Cat(String name) {
		this(name, 0, false, 0.0);
	}
	
	Cat(String name, int age) {
		this(name, age, false, 0.0);
	}
	
	Cat(String name, int age, boolean sex, double weight) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.weight = weight;
		servant = "김대철";
	}
	
	Cat(Cat c) {
		this(c.name, c.age, c.sex, c.weight);
	}
	
	@Override
	public String toString() {
		
		return name + ", " + age + "세, " + (sex ? "여" : "남") + ", " + weight + "kg";
	}
	
	void character(String str) {
		System.out.println(str + " 성격을 가지고 있다.");
	}
	
	void sleep(int i) {
		System.out.println(name + "이는 " + i + "시간 동안 잠을 잔다.");
	}
	
	void vaccination(String name, int day) {
		System.out.println(name + "의 접종일은 " + day + "일입니다.");
	}
	
}