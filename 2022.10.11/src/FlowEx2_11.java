package ex1;

import java.util.*;

public class FlowEx2_11 {

	public static void main(String[] args) {
//		System.out.println("i\t 2*i\t 2*i-1\t i*i\t 11-i\t i%3\t i/3");
//		System.out.println("-----------------------------------------------------");
//		
//		for (int i = 1; i <= 10; i++) {
//			System.out.printf("%d\t %d\t %d\t %d\t %d\t %d\t %d%n", i, 2*i, 2*i-1, i*i, 11-i, i%3, i/3);
//		}
		
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= 5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		for (int i = 0; i < 5; i++) { // 0 1 2 3 4
			for (int j = 4; j >= 0; j--) { // 4 3 2 1 0
				if (j > i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
						
		}
		
//		int num = 0;
//		 System.out.print("*을 출력할 라인의 수를 입력하세요.> ");
//		 
//		 Scanner sc = new Scanner(System.in);
//		 String tmp = sc.nextLine();
//		 num = Integer.parseInt(tmp);
//		 
//		 for (int i = 0; i < num; i++) {
//			 for (int j = 0; j <= i; j++) {
//				 System.out.print("*");
//			 }
//			 System.out.println();
//		 }
		
		// 구구단을 출력하는 반복문
//		for (int i = 2; i <= 9; i++)
//			for (int j = 1; j <= 9; j++) 
//				System.out.printf("%d x %d = %d%n", i, j, i * j);
	}

}
