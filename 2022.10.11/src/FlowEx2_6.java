package ex1;

import java.util.Scanner;

public class FlowEx2_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
				
		
		switch(str) {
		case "aaa":
			System.out.println("aaa를 입력하셨습니다.");
			break;
		case "bbb":
			System.out.println("bbb를 입력하셨습니다.");
			break;
		case "ccc":
			System.out.println("ccc를 입력하셨습니다.");
			break;
		case "ddd":
			System.out.println("ddd를 입력하셨습니다.");
			break;
		default:
			System.out.println("error");
		}


	}

}
