package ex1;

import java.util.Scanner;

public class FlowEx2_2 {

	public static void main(String[] args) {
		System.out.print("점수를 입력해주세요.> ");
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
				
		if (90<= score && score <= 100) {
			System.out.println("학점: A");
		} else if (score >= 80) {
			System.out.println("학점: B");
		} else if (score >= 70) {
			System.out.println("학점: C");
		} else if (score >= 60) {
			System.out.println("학점: D");
		} else {
			System.out.println("학점: F");
		}

	}

}
