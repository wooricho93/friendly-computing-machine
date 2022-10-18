package ex1;

import java.util.Arrays;

public class ArrayEx_4 {

	public static void main(String[] args) {
		int[] score = new int[10];
		
		for (int i = 0; i < score.length; i++)
			score[i] = (int)(Math.random() * 100) + 1;
		
		System.out.println(Arrays.toString(score));
		
		int sum = 0;
		float avg = 0f;
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		avg = (float)sum / score.length;
		
		System.out.println();
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
		
		int max = score[0];
		int min = score[0];
		
		for (int i = 1; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			} else if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		
		System.out.println("---------------------------------------");
		
		for (int i = 0; i < score.length - 1; i++) {
			for (int j = 0; j < score.length - 1 - i; j++) {
				if (score[j] > score[j+1]) {
					int tmp = score[j];
					score[j] = score[j+1];
					score[j+1] = tmp;
				}
			}
		}
		
		
		System.out.println(Arrays.toString(score));
	}

}
