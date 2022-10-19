package ex1;

import java.util.Scanner;

public class FunctionEx_6 {

	public static void main(String[] args) {
		// 매개변수(입력) X, 반환(출력) X
		// 정수 2개를 입력받아서 나누기 기능을 하는 프로그램 작성
		
		System.out.println("나누기 프로그램1");
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개를 입력하세요.> ");
		int i = sc.nextInt();
		int i2 = sc.nextInt();

		divide1(i, i2);
		
		System.out.println("========프로그램 종료========");
		
	}
	
	static void divide1(int x, int y) {
		System.out.println((float)x / y);
	
	}

}
