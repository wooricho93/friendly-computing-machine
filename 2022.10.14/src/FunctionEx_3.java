package ex1;

import java.util.Scanner;

public class FunctionEx_3 {

	public static void main(String[] args) {
		// 매개변수(입력) O, 반환(출력) X
		System.out.println("함수 프로그램3"); // 1
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요.> "); // 2
		int num = sc.nextInt(); // 3
		System.out.println(num); // 4
		
		input1(num); // num = 인자
		
		System.out.println("=====프로그램 종료====="); // 6
	}
	
	static void input1(int i) {
		System.out.println(i * 2); // 5
			
	}

}
