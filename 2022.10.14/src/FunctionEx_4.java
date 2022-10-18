package ex1;

import java.util.Scanner;

public class FunctionEx_4 {

	public static void main(String[] args) {
		// 매개변수(입력) O, 반환(출력) O
		
		System.out.println("함수 프로그램4"); // 1
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요.> "); // 2
		int num = sc.nextInt(); // 3
		
		int i = inOut(num); // 4
		
		System.out.println(num + ", " + i); // 5
		
		System.out.println("=====프로그램 종료====="); // 6
	}
	
	static int inOut(int n) {
		return n * 2; // 4
	}

}
