package ex1;

import java.util.Arrays;

public class ArrayEx_6 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		System.out.println();
		System.out.println("[변경 전]");
		System.out.println("arr.length: " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]: " + arr[i]);
		}
		
		int[] tmp = new int[arr.length * 2];
		
		for (int i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		
		arr = tmp;
		
		System.out.println();
		System.out.println("[변경 후]");
		System.out.println("arr.length: " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i +"]: " + arr[i]);
		}
	}

}
