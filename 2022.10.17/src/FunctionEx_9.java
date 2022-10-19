package ex1;

import java.util.Scanner;

public class FunctionEx_9 {

	public static void main(String[] args) {
		// 매개변수(입력) O, 반환(출력) X
		// 정수 2개를 입력받아서 나누기 기능을 하는 프로그램 작성
		
		System.out.println("나누기 프로그램4");
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요.> ");
		int i = sc.nextInt();
		int i2 = sc.nextInt();

		divide4(i, i2);
		

		
		System.out.println("========프로그램 종료========");
		
	}
	
	static void divide4(int x, int y) {
		double d = (double)x / y;
		System.out.printf("결과값 = %.2f%n", d);
	
	}

}
