import java.util.*;

public class practice_1 {

	public static void main(String[] args) {
		ArrayList<Score> list = new ArrayList<>();
		list.add(new Score("aaa", 100, 100, 100));
		list.add(new Score("bbb", 100, 100, 100));
		list.add(new Score("ccc", 100, 100, 100));
		list.add(new Score("ddd", 100, 100, 100));
		
		Iterator<Score> it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
			
	}

}

class Score {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	Score() {
		
	}
	
	Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}	
	
	int sum() {
		return kor + eng + math;
	}
	
	double avg() {
		return sum() / (double)3.0;
	}
	
	public String toString() {
		return "이름: " + name + ", 총점: " + sum() + ", 평균: " + avg();
	}
}