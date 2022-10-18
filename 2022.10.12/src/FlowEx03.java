package ex1;

import java.util.Scanner;

public class FlowEx03 {

	public static void main(String[] args) {
//		int num = 0, sum = 0;
//		System.out.print("숫자를 입력하세요.> ");
//		
//		Scanner sc = new Scanner(System.in);
//		String tmp = sc.nextLine();
//		num = Integer.parseInt(tmp);
//		
//		while (num != 0) {
//			sum += num%10;
//			System.out.printf("sum = %d num = %d%n", sum, num);
//			
//			num /= 10;
//		}
//		System.out.println("각 자리수의 합: " + sum);
		
//		int sum = 0;
//		int i = 0;
//		
//		while ((sum += ++i) <= 200) {
//			System.out.printf("%d - %d%n", i, sum);
//		}
		int num;
		int sum = 0;
		boolean flag = true; // while문의 조건식으로 사용될 변수
		Scanner sc = new Scanner(System.in);
		
		System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)> ");
		
		while (flag) { // flag의 값이 true이므로 조건식은 참이 된다.
			System.out.print(">>");
			
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);
			
			if (num != 0) { // num이 0이 아니면, sum에 더한다.
				sum += num;
			} else { // num이 0이면, flag의 값을 false로 변경한다.
				flag = false;
			}
		}
		System.out.println("합계: " + sum);
	}
}
