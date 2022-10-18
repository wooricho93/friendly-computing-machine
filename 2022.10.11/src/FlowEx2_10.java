package ex1;

import java.util.*;

public class FlowEx2_10 {

	public static void main(String[] args) {
		int sum = 0;
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//			System.out.printf("1부터 %d까지의 합은 %d입니다.%n", i, sum);
//		}

		
		for (int i = 1; i <= 15; i += 2) {
			sum += i;
			System.out.printf("1부터 %2d까지의 합 = %2d%n", i, sum);
		}
		
//		for (int i = 1; i <= 10; i++) {
//			System.out.printf("%d \t %d%n", i, 11 - i);
//		}
	}

}
