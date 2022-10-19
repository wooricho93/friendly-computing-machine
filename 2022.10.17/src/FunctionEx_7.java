package ex1;

import java.util.Scanner;

public class FunctionEx_7 {

	public static void main(String[] args) {
		// 매개변수(입력) O, 반환(출력) O
		// 정수 2개를 입력받아서 나누기 기능을 하는 프로그램 작성
		
		System.out.println("나누기 프로그램2");
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요.> ");
		int i = sc.nextInt();
		int i2 = sc.nextInt();

		double d = divide2(i, i2);
		
		System.out.printf("결과값 = %.2f%n", d);
		
		System.out.println("========프로그램 종료========");
		
	}
	
	static double divide2(int x, int y) {
		double d = x / (double)y;
		return d;
	
	}

}
