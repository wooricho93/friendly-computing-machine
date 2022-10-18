package ex1;

import java.util.Scanner;

public class FlowEx2_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 2개 입력해 주세요.>");
		int i = sc.nextInt();
		int i2 = sc.nextInt();
		
		System.out.print("연산방법을 선택해 주세요.>");
		int i3 = sc.nextInt();
		
		switch(i3) {
		case 1:
			System.out.println(i + i2);
			break;
		case 2:
			System.out.println(i - i2);
			break;
		case 3:
			System.out.println(i * i2);
			break;
		case 4:
			System.out.println(i / i2);
			break;
		default:
		}


	}

}
