package test;

public class Exam04 {

	public static void main(String[] args) {
//		int a = 1000000;
		
//		int result1 = a * a / a;
//		long result1 = a * (long)a / a; // a * a의 결과값이 int 타입의 범위를 넘어서기 때문에 반드시 a * a 중 하나에 (long)을 붙여야 한다.
		
//		int result1 = (int)(a * (long)a / a);
//		int result2 = a / a * a;
//		long result3 = a * a / (long)a;
		
//		System.out.printf("%d * %d / %d = %d%n", a, a, a, result1); // 오버플로우; int 타입의 범위 초과
//		System.out.printf("%d / %d * %d = %d%n", a, a, a, result2); // int 타입의 범위: 약 -21억~21억
//		System.out.printf("%d * %d / %d = %d%n", a, a, a, result3);
		
		char a = 'a'; // 97
		char d = 'd'; // 100
		char zero = '0'; // 48
		char two = '2'; // 50
		
		System.out.printf("'%c' - '%c' = %d%n", d, a, d - a);
		System.out.printf("'%c' - '%c' = %d%n", two, zero, two - zero);
		System.out.printf("'%c' = %d%n", a, (int)a);
		System.out.printf("'%c' = %d%n", d, (int)d);
		System.out.printf("'%c' = %d%n", zero, (int)zero);
		System.out.printf("'%c' = %d%n", two, (int)two);
		
		System.out.printf("'%c' - '%c' = %d%n", a, zero, a - zero);
		System.out.printf("'%c' - '%c' = %d%n", d, two, d - two);

		
//		char c1 = 'a';
//		char c2 = c1;
//		char c3 = ' ';
//		
//		int i = c1 + 1;
//		
//		c3 = (char)(c1 + 1);
//		c2++;
//		c2++;
//		
//		System.out.println("i = " + i);
//		System.out.println("c2 = " + c2);
//		System.out.println("c3 = " + c3);
	
	}

}
