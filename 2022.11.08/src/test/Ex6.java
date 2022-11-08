package test;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력해 주세요.> ");
		String str = sc.nextLine();
		int i = (int)(Math.random() * str.length());
		
		if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
			System.out.println("입력하신 문자의 " + (i + 1) + "번째 글자는 대문자입니다.");
		else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			System.out.println("입력하신 문자의 " + (i + 1) + "번째 글자는 대문자가 아닙니다.");
		else
			System.out.println("입력하신 문자는 영문이 아닙니다.");
	}
}
