package test;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요.> ");
		int input = sc.nextInt();
		
		if (input >= 50)
			System.out.println("입력하신 숫자는 50보다 큽니다.");
		else
			System.out.println("입력하신 숫자는 50보다 작습니다.");
	}

}
