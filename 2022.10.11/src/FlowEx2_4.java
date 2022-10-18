package ex1;

import java.util.Scanner;

public class FlowEx2_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 두 개를 입력해 주세요.> ");
		int input1 = sc.nextInt();

		int input2 = sc.nextInt();

		
		System.out.print("연산방법을 선택해 주세요.> ");
//		sc.nextLine();
		String input3 = sc.next();
		
		if (input3.equals("+")) {
			System.out.println("결과값은 " + (input1 + input2) + "입니다.");
		} else if (input3.equals("-")) {
			System.out.println("결과값은 " + (input1 - input2) + "입니다.");
		} else if (input3.equals("*")) {
			System.out.println("결과값은 " + (input1 * input2) + "입니다.");
		} else if (input3.equals("/")) {
			System.out.println("결과값은 " + (input1 / input2) + "입니다.");
		}
		

	}

}
