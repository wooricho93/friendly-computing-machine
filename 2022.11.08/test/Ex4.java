package test;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("세 개의 정수를 입력해 주세요.> ");
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		int max = input1;
		int min = input1;
		int sum;
		float avg;
	
		max = (input1 > input2) ? (input1 > input3 ? input1 : input3) : (input2 > input3 ? input2 : input3);
		min = (input1 < input2) ? (input1 < input3 ? input1 : input3) : (input2 < input3 ? input2 : input3);
		
		
		sum = input1 + input2 + input3;
		avg = sum / (float)3.0;
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		System.out.println(avg);
	}
}
