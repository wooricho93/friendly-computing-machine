package ex1;

import java.util.Scanner;

public class FunctionEx_2 {

	public static void main(String[] args) {
		// 매개변수(입력) X, 반환(출력) O
		System.out.println("함수 프로그램2"); // 1
		int n = output1(); // 5
		
		System.out.println(n * 2); // 6
	}
	
	static int output1() {
		System.out.println("반환 타입만 있는 함수 test"); // 2
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요.> "); // 3
		int i = sc.nextInt(); // 4
		System.out.println(i); // 5
		return i;
	}

}
