package ex1;

import java.util.Scanner;

public class FunctionEx_5 {

	public static void main(String[] args) {
		// 매개변수(입력) O, 반환(출력) O
		
		System.out.println("함수 프로그램5"); // 1
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 2개 입력하세요.> "); // 2
		int num = sc.nextInt(); // 3
		int num2 = sc.nextInt(); // 3
		
		
		int i = inOut2(num, num2); // 3-2
		
		System.out.println("num = " + num); // 4
		System.out.println("num2 = " + num2);
		System.out.println("num + num2 = " + (num + num2));
		
		System.out.println("========프로그램 종료========"); // 5
	}
	
	static int inOut2(int n, int m) {
		return n + m; // 3-1
	}

}
