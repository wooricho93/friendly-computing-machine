package test;

import java.util.Scanner;

public class TimeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int time = Integer.parseInt(input);
		
		// 60s * 60m = 1h
		// 60s = 1m
//		3600(1h) + 360(6m) + 40(s)
		

		
		int hh = time / 3600;
		int mm = time % 3600 / 60; 
		int ss = time % 3600 % 60; // time % 60
		System.out.println(time + "초 = " + hh + "시간 " + mm + "분 " + ss + "초");

	}

}
