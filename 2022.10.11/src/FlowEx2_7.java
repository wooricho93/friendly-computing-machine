package ex1;

import java.util.Scanner;

public class FlowEx2_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("학점: A");
			break;
		case 8:
			System.out.println("학점: B");
			break;
		case 7:
			System.out.println("학점: C");
			break;
		case 6:
			System.out.println("학점: D");
		default:
			System.out.println("학점: F");
		}


	}

}
