package test;

import java.util.Scanner;

public class pc_Scanner {

	public static void main(String[] args) {
		// 두 정수를 키보드로 입력받아서 합을 구하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해 주세요.> ");
		
		String input1 = sc.nextLine();
		int num1 = Integer.parseInt(input1);
		
		System.out.print("정수를 입력해 주세요.> ");
		String input2 = sc.nextLine();
		int num2 = Integer.parseInt(input2);
		System.out.println("input1 = " + input1);
		System.out.println("input2 = " + input2);
		
		System.out.println("input1 + input2 = " + (num1 + num2));

		
	}

}
