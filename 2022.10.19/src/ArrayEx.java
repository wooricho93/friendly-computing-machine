import java.util.Arrays;
import java.util.Collections;

public class ArrayEx {

	public static void main(String[] args) {
		int[] arr = new int[40];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		int tmp = 0;

		
		for (int i = 0; i < arr.length; i++) {
			int j = (int)(Math.random() * 40);
			tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		
		int[] arr2 = new int[40];
		int[] arr3 = new int[40];
		
		int index1 = 0, index2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2 == 0) {
				arr2[index1++] = arr[i];
			} else {
				arr3[index2++] = arr[i];
			}
		}
		int[] even = new int[20];
		System.arraycopy(arr2, 0, even, 0, even.length);
		
		for (int j = 0; j < even.length - 1; j++) {
			for (int k = 0; k < even.length - 1 - j; k++) {
				if (even[k] < even[k+1]) {
					int t = even[k];
					even[k] = even[k+1];
					even[k+1] = t;
				}
			}
		}
		
		
		int[] odd = new int[20];
		System.arraycopy(arr3, 0, odd, 0, odd.length);
		
		for (int j = 0; j < odd.length - 1; j++) {
			for (int k = 0; k < odd.length - 1 - j; k++) {
				if (odd[k] < odd[k+1]) {
					int t = odd[k];
					odd[k] = odd[k+1];
					odd[k+1] = t;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println();
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));
	}

}
