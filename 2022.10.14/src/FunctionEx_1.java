package ex1;

public class FunctionEx_1 {

	public static void main(String[] args) {
		// 매개변수(입력) X, 반환(출력) X
		
		System.out.println("함수 프로그램1");
		func1(); // 함수(메서드) 호출
		System.out.println("프로그램 종료");
	}
	
	// void(자리)는 반환 타입을 결정, func1은 함수 이름(명명규칙은 변수와 동일)
	// void는 반환 타입 無 (return X)
	static void func1() { // 함수 정의
		System.out.println("매개변수와 반환 타입이 없는 함수 test");
	}
	

}
