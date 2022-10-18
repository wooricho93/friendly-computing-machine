package ex1;

import java.util.Arrays;

public class ArrayEx_5 {

	public static void main(String[] args) {
		int[] num = {10, 20, 30, 40, 50};
		
		System.out.println("num = " + Arrays.toString(num));
//		System.out.println(num.length);
		
		int[] num2 = new int[num.length * 2];
		for (int i = 0; i < num.length; i++)
			num2[i] = num[i];
		
		
		System.out.println("num2 = " + Arrays.toString(num2));
		
		for (int i = num.length; i < num2.length; i++) {
			num2[i] = 10 * (i + 1);
		}
		System.out.println("num2 = " + Arrays.toString(num2));
		
		int[] num3 = new int[num.length * 2];
		System.arraycopy(num, 0, num3, 0, num.length);
		System.out.println("num3 = " + Arrays.toString(num3));
		
		System.out.println();
		
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] no = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc);
		System.out.println(no);
		
		char[] result = new char[abc.length + no.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(no, 0, result, abc.length, no.length);
		System.out.println(result);
		
		System.arraycopy(abc, 0, no, 0, abc.length);
		System.out.println(no);
		
		System.arraycopy(abc, 0, no, 6, 3);
		System.out.println(no);
	}

}
