package test;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개를 입력해 주세요.> ");
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		
		int sum;
		float avg;
		char score;
		
		sum = input1 + input2 + input3;
		avg = sum / (float)3.0;
		
		if (sum >= 90 && sum <= 100)
			score = 'A';
		else if (sum >= 80)
			score = 'B';
		else if (sum >= 70)
			score = 'C';
		else if (sum >= 60)
			score = 'D';
		else
			score = 'F';
		
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(score);
	}
}
