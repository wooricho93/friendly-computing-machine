
public class ClassVarEx2 {

	public static void main(String[] args) {
		Tests2 t = new Tests2();
		t.ivFunc();
	}

}

class Tests2 {
	int iv = 0;
	static int cv = 0; // 선언과 동시에 메모리에 올라가기 때문에 어디서든 사용 가능
	
	void ivFunc() {
		iv = 0;
		cv = 0;
		cvFunc();
		testFunc();
	}
	
	static void cvFunc() {
//		iv = 0;   -> iv는 객체 생성 전까지는 메모리에 올라가지 않기 때문에 사용 불가
//		ivFunc(); -> ivFunc()도 마찬가지
		cv = 0;
		testFunc();
	}
	
	
	static void testFunc() {
		cv = 0;
		cvFunc();
	}
}