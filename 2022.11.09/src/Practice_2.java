import java.util.*;

public class Practice_2 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("aaa", 100, 100, 100));
		list.add(new Student("bbb", 90, 90, 90));
		list.add(new Student("ccc", 80, 80, 80));
		list.add(new Student("ddd", 70, 70, 70));
		
		Iterator<Student> it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
		
		ArrayList<TeamClass> list2 = new ArrayList<>();
		list2.add(new TeamClass("eee", 60, 60, 60, 60, 60));
		list2.add(new TeamClass("fff", 50, 50, 50, 50, 50));
		list2.add(new TeamClass("ggg", 40, 40, 40, 40, 40));
		
		Iterator<TeamClass> it2 = list2.iterator();
		while (it2.hasNext())
			System.out.println(it2.next());
	}
		
}

class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int sum() {
		return kor + eng + math;
	}
	
	public double avg() {
		return sum() / 3.0;
	}
	
	public String toString() {
		return "이름: " + name + ", 총점: " + sum() + ", 평균: " + avg();
	}
}

class TeamClass extends Student {
	private int sci;
	private int com;
	
	TeamClass(String name, int kor, int eng, int math, int sci, int com) {
		super(name, kor, eng, math);
		this.sci = sci;
		this.com = com;
	}
	
	public int sum() {
		return super.sum() + sci + com;
	}
	
	public double avg() {
		return sum() / 5.0;
	}
}