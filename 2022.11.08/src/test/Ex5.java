package test;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요.> ");
		int input = sc.nextInt();
		
		if (input > 0)
			System.out.println("입력하신 숫자는 양수입니다.");
		else if (input < 0)
			System.out.println("입력하신 숫자는 음수입니다.");
		else
			System.out.println("입력하신 숫자는 0입니다.");
	}
}
