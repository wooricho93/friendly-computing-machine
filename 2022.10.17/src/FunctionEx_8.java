package ex1;

import java.util.Scanner;

public class FunctionEx_8 {

	public static void main(String[] args) {
		// 매개변수(입력) X, 반환(출력) O
		// 정수 2개를 입력받아서 나누기 기능을 하는 프로그램 작성
		
		System.out.println("나누기 프로그램3");
		

		double d = divide3();
		
		System.out.printf("결과값 = %.2f%n", d);
		
		System.out.println("========프로그램 종료========");
		
	}
	
	static double divide3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요.> ");
		int i = sc.nextInt();
		int i2 = sc.nextInt();
		System.out.println(i + ", " +i2);
		return i / i2;
	}

}
