package wooricho;

public class StaticBlockTest {

	public static void main(String[] args) {
		for (int i = 0; i < arr.length; i++) 
			System.out.println("arr[" + i + "]: " + arr[i]);
	}

	static int[] arr = new int[10]; // 길이가 10인 인스턴스 배열 arr 선언
	
	static {
		for (int i = 0; i < arr.length; i++) {
			// 1~10 사이의 임의의 수를 arr[i]에 무작위로 대입
			arr[i] = (int)(Math.random() * 10) + 1;
		}
	}
	
}