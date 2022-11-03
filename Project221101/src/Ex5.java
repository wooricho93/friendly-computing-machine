import java.util.Arrays;
import java.util.Collections;

// 임의의 정수를 배열로 생성해서 입력하고 정렬(오름차순, 내림차순)하는 프로그램 작성	
public class Ex5 {

	public static void main(String[] args) {
		sort();
	}
	
	static void sort() {
		Integer[] arr = new Integer[5];
		System.out.print("정렬 전: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100);
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		Integer[] abscArr = new Integer[arr.length];
		System.arraycopy(arr, 0, abscArr, 0, arr.length);
		System.out.print("오름차순 정렬: ");
		Arrays.sort(abscArr);
		for (int i = 0; i < abscArr.length; i++)
			System.out.print(abscArr[i] + " ");
		
		System.out.println();
		
		Integer[] descArr = new Integer[arr.length];
		System.arraycopy(arr, 0, descArr, 0, arr.length);
		System.out.print("내림차순 정렬: ");
		Arrays.sort(descArr, Collections.reverseOrder());
		for (int i = 0; i < descArr.length; i++)
			System.out.print(descArr[i] + " ");
	}
	
}
