package test;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학년을 입력해 주세요.> ");
		int grade = sc.nextInt();
		System.out.print("점수를 입력해 주세요.> ");
		int score = sc.nextInt();
		
		if (grade == 4) {
			if (score >= 70)
				System.out.println("합격입니다.");
			else if (score >= 100 || score <= 0)
				System.out.println("유효한 숫자가 아닙니다.");
			else
				System.out.println("불합격입니다.");
		} else {
			if (score >= 60)
				System.out.println("합격입니다.");
			else if (score >= 100 || score <= 0)
				System.out.println("유효한 숫자가 아닙니다.");
			else
			System.out.println("불합격입니다.");
		} 
	}
}
