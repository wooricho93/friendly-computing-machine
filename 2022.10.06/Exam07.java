package test;

public class Exam07 {

	public static void main(String[] args) {
		int a = 15; // 2진수 = 1111
		int b = 10; // 2진수 = 1010
		
		System.out.println(a & b); // 두 값이 모두 1이면 1 반환; 1010(2진수) -> 10(10진수)
		System.out.println(a | b); // 둘 중 하나가 1이면 1 반환; 1111(2진수) -> 15(10진수)
		System.out.println(a ^ b); // 값이 서로 다를 때만 1 반환; 0101(2진수) -> 5(10진수)
		
		
	}
	
	}


