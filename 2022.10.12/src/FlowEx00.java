package ex1;

import java.util.Scanner;

public class FlowEx00 {

	public static void main(String[] args) {
		// 정수 3개를 입력받아서 최대값과 최소값을 구하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개를 입력하세요.> ");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int max = 0, min = 0;
		
		if (num > num2 && num > num3) {
			max = num;
			min = num2 > num3 ? num3 : num2;
		} else if (num2 > num && num2 > num3) {
			max = num2;
			min = num > num3 ? num3 : num;
		} else if (num3 > num && num3 > num2) {
			max = num3;
			min = num > num2 ? num2 : num;
		}

		System.out.println("최대값: " + max + ", 최소값: " + min);
		
//		if (num > num2 && num > num3) {
//			System.out.println("최대값: " + num);
//		} else if (num2 > num && num2 > num3) {
//			System.out.println("최대값: " + num2);
//		} else if (num3 > num && num3 > num2) {
//			System.out.println("최대값: " + num3);
//		}
//		
//		if (num < num2 && num < num3) {
//			System.out.println("최소값: " + num);
//		} else if (num2 < num && num2 < num3) {
//			System.out.println("최소값: " + num2);
//		} else if (num3 < num && num3 < num2) {
//			System.out.println("최소값: " + num3);
//		}
	}

}
