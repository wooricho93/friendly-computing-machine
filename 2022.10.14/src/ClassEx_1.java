package ex1;

public class ClassEx_1 {

	public static void main(String[] args) {
		Score s = new Score("Kim", 96, 95, 99);
		s.sum();
		s.average();
		s.show();
		
		Score s2 = new Score("Park", 50, 45, 60);
		s2.sum();
		s2.average();
		s2.show();
		
		Score s3 = new Score("Lee", 10, 20, 45);
		s3.sum();
		s3.average();
		s3.show();
		
		Score s4 = new Score("Choe", 11, 22, 33);
		s4.sum();
		s4.average();
		s4.show();
	}

}

class Score {
	String name; // 속성, 변수, 인스턴스 변수
	int kor;
	int eng;
	int math;
	
	int total;
	double avg;
	
	// 생성자
	Score (String str, int k, int e, int m) {
		name = str;
		kor = k;
		eng = e;
		math = m;
	}
	
	void sum() {
		total =  kor + eng + math;
		
	}
	
	void average() {
		avg = total / 3.0;
	}
	
	void show() {
		System.out.println("이름: " + name);
		System.out.printf("kor = %d, eng = %d, math = %d%n", kor, eng, math);
		System.out.println("총점: " + total);
		System.out.printf("평균: %.1f%n", avg);
		System.out.println();
	}
}