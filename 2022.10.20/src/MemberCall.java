
public class MemberCall {

	int iv = 10; // 객체 생성 시 메모리 공간에 로드
	static int cv = 20; // 선언과 동시에 메모리 공간에 로드
	
	int iv2 = cv;
	
//	static int cv2 = iv; -> 에러; 클래스 변수는 인스턴스 변수 사용 불가
	static int cv2 = new MemberCall().iv; // 객체를 생성하면 인스턴스 변수 사용 가능
	
	static void staticMethod() {
		System.out.println(cv);
//		System.out.println(iv); -> 에러; 클래스 메서드에서는 인스턴스 변수 사용 불가
		MemberCall c = new MemberCall(); // 객체 생성
		System.out.println(c.iv); // 위처럼 객체를 생성한 후에는 인스턴스 변수 참조 가능
	}
	
	void instanceMethod() { // 인스턴스 메서드는 인스턴스 변수, 클래스 변수, 인스턴스 메서드 모두 사용 가능
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod();
//		instanceMethod(); -> 에러; 클래스 메서드는 인스턴스 메서드 사용 불가
		MemberCall c = new MemberCall();
		c.instanceMethod(); // 인스턴스를 생성한 후에 호출 가능
	}
	
	void instanceMethod2() {
		staticMethod();
		instanceMethod();
	}

}
