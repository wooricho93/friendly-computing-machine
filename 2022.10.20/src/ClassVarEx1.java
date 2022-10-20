
public class ClassVarEx1 {

	// main 메서드에 생성된 인스턴스 객체의 개수를 세는 프로그램
	public static void main(String[] args) {
		Tests t1 = new Tests();
		Tests t2 = new Tests();
		Tests t3 = new Tests();
		Tests t4 = new Tests();
		Tests t5 = new Tests();
			
		System.out.println(Tests.num);
	}

}

class Tests {
	static int num = 0;
	
	Tests() {
		num++;
	}
}