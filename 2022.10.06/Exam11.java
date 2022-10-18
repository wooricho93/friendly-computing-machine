package test;

public class Exam11 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = (byte)(a + b);
//		byte c = a + b; -> byte로 형변환 하지 않으면 자동으로 int 타입이라고 인식
		
		char ch = 'A';
		ch = (char)(ch + 2); // ch + 2 -> int 타입이라고 인식
		float f = 3 / 2f; // 정수 / 정수 -> 나머지(몫)는 절삭
		long l = (long)3000 * 3000 * 3000; // 3000 * 3000 * 3000 -> int 타입
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = ((float)d == f2);
		
		System.out.println("c = " + c);
		System.out.println("ch = " + ch);
		System.out.println("f = " + f);
		System.out.println("l = " + l);
		System.out.println("result = " + result);
		
	}
	
}


