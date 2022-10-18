package test;

import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값을 입력하시오.> ");
		int i = sc.nextInt();
		
		int result;
		
//		if (i > 0) {
//			result = i;
//		} else {
//			result = i * (-1);
//		}
		
		result = (i > 0) ? i : i * (-1); // 조건식 ? 조건식이 참일 때 반환할 값 : 조건식이 거짓일 때 반환할 값;
		
		System.out.println("ABS: " + result);
	}
	
}


