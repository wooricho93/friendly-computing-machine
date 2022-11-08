package test;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요.> ");
		int input = sc.nextInt();
		
		if (input % 3  != 0 || input == 0)
			System.out.println("입력하신 숫자는 3의 배수가 아닙니다.");
		else
			System.out.println("입력하신 숫자는 3의 배수입니다.");
	}

}
