package ex1;

public class ArrayEx_1 {

	public static void main(String[] args) {
		int[] score = new int[6];
		// 타입[] 변수이름(참조변수) = new 타입[길이]
		for (int i = 0; i < 6; i++) {
			int n = (int)(Math.random() * 45) + 1;
			score[i] = n;
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(score[i] + ", ");
		}
	}

}
