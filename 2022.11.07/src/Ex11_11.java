import java.util.*;

public class Ex11_11 {

	public static void main(String[] args) {
		int[] arr = {1, 5, 3, 2, 4};
		String[] str = {"aaa", "abc", "cdef", "bbbbb", "ac"};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(str));
		Arrays.sort(arr);
		Arrays.sort(str);
		System.out.println("======================");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(str));
		System.out.println("======================");
		Integer[] arr2 = {1, 5, 3, 2, 4};
		Arrays.sort(arr2, new Desc());
		System.out.println(Arrays.toString(arr2));
	}

}

class Desc implements Comparator<Integer> {
	public int compare(Integer i1, Integer i2) {
		return i1.compareTo(i2) * -1;
	}

}

